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

    ArrayList<Cart> getCartsByUser(User user);

    int addProductToCart(Cart cart);

}
