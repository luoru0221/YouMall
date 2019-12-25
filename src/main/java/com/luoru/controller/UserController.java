package com.luoru.controller;

import com.luoru.pojo.User;
import com.luoru.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  @author: Luoru
 *  @Date: 2019/12/12 22:36
 *  @Description: 用户信息Controller接口
 */
@CrossOrigin
@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @RequestMapping(path = "/login")
    public User login(@RequestBody User user){
        return userService.userLogin(user);
    }
}
