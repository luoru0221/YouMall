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

    /**
     * 根据手机号查询用户信息
     * @param user User对象
     * @return 查询到返回的结果
     */
    User findUser(User user);

    /**
     * 添加用户
     * @param user 待添加的用户
     * @return SQL执行状态
     */
    int insertUser(User user);

    /**
     * 修改用户的类型
     * @param userId 待修改的用户Id
     */
    void updateUserType(int userId);

}
