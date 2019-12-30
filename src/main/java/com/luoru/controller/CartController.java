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
 * @author: Luoru
 * @Date: 2019/12/21 13:43
 * @Description: 购物车Controller层接口
 */
@CrossOrigin
@Controller
@RequestMapping(path = "/cart")
public class CartController {

    @Autowired
    private CartServiceImpl cartService;

    /**
     * 加载用户所有购物车
     *
     * @param user 待加载的购物车的用户
     * @return 该用户的所有购物车
     */
    @ResponseBody
    @RequestMapping(path = "/someone")
    public ArrayList<Cart> findCartsByUser(@RequestBody User user) {
        return cartService.getCartsByUser(user);
    }

    /**
     * 添加购物车
     *
     * @param cart 待添加的购物车
     * @return 执行状态
     */
    @ResponseBody
    @RequestMapping(path = "/add")
    public int addProductToCart(@RequestBody Cart cart) {
        return cartService.addProductToCart(cart);
    }

    /**
     * 删除购物车
     *
     * @param carts 待删除的购物车
     * @return 是否删除成功
     */
    @ResponseBody
    @RequestMapping(path = "/delete")
    public boolean deleteCart(@RequestBody ArrayList<Cart> carts) {
        for (Cart cart : carts) {
            boolean success = cartService.deleteCart(cart);
            if (!success)
                return false;
        }
        return true;
    }

}