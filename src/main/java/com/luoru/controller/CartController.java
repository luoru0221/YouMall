package com.luoru.controller;

import com.luoru.pojo.Cart;
import com.luoru.pojo.User;
import com.luoru.service.impl.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/21 13:43
 *  @Description: 购物车Controller层接口
 */
@CrossOrigin
@Controller
@RequestMapping(path = "/cart")
public class CartController {

    @Autowired
    private CartServiceImpl cartService;

    @ResponseBody
    @RequestMapping(path = "/someone")
    public ArrayList<Cart> findCartsByUser(@RequestBody User user){
        return cartService.getCartsByUser(user);
    }

    @ResponseBody
    @RequestMapping(path = "/add")
    public int addProductToCart(@RequestBody Cart cart){
        return cartService.addProductToCart(cart);
    }


}