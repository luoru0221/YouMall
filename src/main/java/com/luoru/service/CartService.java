package com.luoru.service;

import com.luoru.pojo.Cart;
import com.luoru.pojo.User;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/21 14:21
 *  @Description: CartService接口
 */
public interface CartService {

    /**
     * 查询用户所有购物车
     * @param user 用户
     * @return 改用户的所有购物车
     */
    ArrayList<Cart> getCartsByUser(User user);

    /**
     * 添加商品到购物车
     * @param cart 将加入的Cart
     * @return 执行状态
     */
    int addProductToCart(Cart cart);

    /**
     * 删除购物车
     * @param cart 待删除的购物车
     * @return 是否删除成功
     */
    boolean deleteCart(Cart cart);

}
