package com.luoru.service;

import com.luoru.pojo.User;

/**
 *  @author: Luoru
 *  @Date: 2019/11/19 19:21
 *  @Description: UserService接口
 */
public interface UserService {

    /**
     * 根据Id查询用户信息
     * @return 查询到的User对象
     */
    public User findUserById(String id);

}
