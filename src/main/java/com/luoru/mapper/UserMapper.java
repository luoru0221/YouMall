package com.luoru.mapper;

import com.luoru.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/8 15:19
 *  @Description: User持久层接口
 */
@Repository
public interface UserMapper {

    /**
     * 根据Id查询用户信息
     * @param userId 用户Id
     * @return 该用户的所有信息
     */
    User findUserById(int userId);

    /**
     * 查询所有用户信息
     * @return 所有的用户信息
     */
    ArrayList<User> findAllUsers();

    /**
     * 根据手机号查询用户信息
     * @param userPhone 用户手机号
     * @return 该手机号绑定的用户
     */
    User findUserByPhone(String userPhone);

}
