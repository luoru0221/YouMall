package com.luoru.service.impl;

import com.luoru.mapper.UserMapper;
import com.luoru.pojo.User;
import com.luoru.utils.Md5;
import com.luoru.utils.ResponseMsg;
import com.luoru.utils.SendSms;
import com.luoru.utils.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author: Luoru
 * @Date: 2019/12/21 13:47
 * @Description: User业务层
 */
@Service("userService")
public class UserServiceImpl implements com.luoru.service.UserService {


    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public User userLogin(User user) {
        String pwd = Md5.toMd5(user.getUserPassword());
        user.setUserPassword(pwd);
        return userMapper.findUser(user);
    }

    @Override
    public User registerUser(User user, String msgCode) {

        //验证Redis中存储的用户验证码是否跟用户输入的验证码一致,存储的数据为序列化数据，首先反序列化
        byte[] byteCode = (byte[]) redisUtil.getCacheValue(user.getUserPhone());
        String rightMsgCode = (String)SerializeUtil.unserialize(byteCode);
        if (rightMsgCode != null && rightMsgCode.equals(msgCode)) {
            //将用户的密码使用Md5进行加密
            String pwd = user.getUserPassword();
            user.setUserPassword(Md5.toMd5(pwd));
            user.setUserType(0);//设置用户类型为普通类型
            int type = userMapper.insertUser(user);//将用户信息存储至数据库
            if (type == 1) {
                return user;
            }
        }
        return null;
    }

    @Override
    public ResponseMsg sendMsgCode(String userPhone) {

        ResponseMsg msg = new ResponseMsg();
        User userByPhone = userMapper.findUserByPhone(userPhone);
        if(userByPhone!=null){
            msg.setHttpStatus(400);
            msg.setData("phoneHaveExist");
        }else {
            //随机验证码
            String randMsgCode = new Random().nextInt(900000) + 100000 + "";
            //发送验证码
            String data = SendSms.send(userPhone, randMsgCode);
            //验证码序列化，并存入redis
            byte[] serializeCode = SerializeUtil.serialize(randMsgCode);
            redisUtil.setCacheValue(userPhone, serializeCode);

            byte[] code = (byte[]) redisUtil.getCacheValue(userPhone);
            System.out.println("redis中存储的" + SerializeUtil.unserialize(code));

            msg.setHttpStatus(200);
            msg.setData(data);
        }
        return msg;
    }


}
