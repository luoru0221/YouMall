package com.luoru.service;

import com.luoru.pojo.User;
import com.luoru.utils.ResponseMsg;

/**
 *  @author: Luoru
 *  @Date: 2019/11/19 19:21
 *  @Description: UserService接口
 */
public interface UserService {

    /**
     * 用户登录
     * @return 登录成功返回user对象，否则返回null
     */
    User userLogin(User user);

    /**
     * 用户注册
     * @param user 待注册的用户
     * @param msgCode 用户输入的验证码
     * @return 注册成功返回User对象，否则返回null
     */
    User registerUser(User user,String msgCode);

    /**
     * 发送验证码
     * @param userPhone 需验证的手机号码
     */
    ResponseMsg sendMsgCode(String userPhone);


}
