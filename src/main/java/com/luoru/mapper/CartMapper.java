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

    /**
     * 添加商品到购物车
     * @param cart 购物车
     */
    void addProductToCart(Cart cart);

    /**
     * 查询数据库是否已经存在该购物车
     * @param cart 需查询的购物车
     * @return 存在返回该购物车，否则返回null
     */
    Cart findCartByCart(Cart cart);

    /**
     * 修改购物车中的商品数量
     * @param cart 待修改的购物车
     */
    void addCartProductNumber(Cart cart);

    /**
     * 根据购物车的Id删除购物车
     * @param cartId 购物车Id
     * @return SQL执行状态
     */
    int deleteCartByCartId(int cartId);
}
