package com.luoru.service.impl;

import com.luoru.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  @author: Luoru
 *  @Date: 2019/12/21 13:47
 *  @Description: Cart业务层
 */
@Service("cartService")
public class CartServiceImpl {

    @Autowired
    private CartMapper cartMapper;


}
