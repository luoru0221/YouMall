package com.luoru.controller;

import com.luoru.pojo.User;
import com.luoru.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(path = "/login")
    public String login(){
        User user = userService.findUserById("123456");
        System.out.println("hello world! Controller层");
        System.out.println(user);
        return "index";
    }
}
