package com.luoru.mapper;

import com.luoru.pojo.User;
import org.springframework.stereotype.Repository;

/**
 *  @author: Luoru
 *  @Date: 2019/11/17 19:41
 *  @Description: User持久层接口
 */
@Repository
public interface UserMapper {

    public User findUserById(String id);

}
