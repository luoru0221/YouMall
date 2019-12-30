package com.luoru.service.impl;

import com.luoru.mapper.UserMapper;
import com.luoru.pojo.User;
import com.luoru.utils.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Luoru
 * @Date: 2019/12/21 13:47
 * @Description: User业务层
 */
@Service("userService")
public class UserServiceImpl implements com.luoru.service.UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public User userLogin(User user) {
        String pwd = Md5.toMd5(user.getUserPassword());
        user.setUserPassword(pwd);
        return userMapper.findUser(user);
    }
}
