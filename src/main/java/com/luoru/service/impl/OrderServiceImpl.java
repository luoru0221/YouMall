package com.luoru.service.impl;

import com.luoru.mapper.OrderMapper;
import com.luoru.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;


}
