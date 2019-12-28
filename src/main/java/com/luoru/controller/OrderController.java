package com.luoru.controller;

import com.luoru.mapper.OrderItemMapper;
import com.luoru.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  @author: Luoru
 *  @Date: 2019/12/29 2:06
 *  @Description: Order表现层
 */
@CrossOrigin
@Controller
@RequestMapping(path = "/order")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;

}
