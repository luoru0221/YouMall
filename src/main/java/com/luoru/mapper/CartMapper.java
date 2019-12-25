package com.luoru.mapper;

import com.luoru.pojo.Cart;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/21 12:32
 *  @Description: Cart持久层接口
 */
@Repository
public interface CartMapper {

    /**
     * 查询某个用户的购物车
     * @param userId 待查询的用户Id
     * @return 该用户的购物车信息
     */
    ArrayList<Cart> findCartByUserId(int userId);
}
