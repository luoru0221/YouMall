package com.luoru.service.impl;

import com.luoru.mapper.UserMapper;
import com.luoru.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements com.luoru.service.UserService {


    @Autowired
    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findUserById(String id) {
        return userMapper.findUserById("123");
    }
}
