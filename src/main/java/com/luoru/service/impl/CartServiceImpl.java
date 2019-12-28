package com.luoru.service.impl;

import com.luoru.mapper.CartMapper;
import com.luoru.pojo.Cart;
import com.luoru.pojo.Product;
import com.luoru.pojo.User;
import com.luoru.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/21 13:47
 *  @Description: Cart业务层
 */
@Service("cartService")
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;


    @Override
    public ArrayList<Cart> getCartsByUser(User user) {
        return cartMapper.findCartByUserId(user.getUserId());
    }

    @Override
    public int addProductToCart(Cart cart) {
        Cart byCart = cartMapper.findCartByCart(cart);
        int cartId;

        if(byCart==null){  //购物车不存在
            cartMapper.addProductToCart(cart);
            //新增记录的主键已经返回到cart.cartId中
            cartId = cart.getCartId();
        }
        else{  //购物车已存在
            cart.setProductNumber(cart.getProductNumber()+byCart.getProductNumber());
            cartMapper.addCartProductNumber(cart);
            cartId = byCart.getCartId();
        }
        return cartId;
    }
}
