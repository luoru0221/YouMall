package com.luoru.service.impl;

import com.luoru.mapper.OrderItemMapper;
import com.luoru.pojo.OrderItem;
import com.luoru.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Override
    public boolean addOrderItem(OrderItem orderItem){
        int type = orderItemMapper.insertOrderItem(orderItem);
        return type == 1;
    }

}
