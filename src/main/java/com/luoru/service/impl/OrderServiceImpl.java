package com.luoru.service.impl;

import com.luoru.mapper.OrderMapper;
import com.luoru.pojo.Order;
import com.luoru.service.OrderService;
import com.luoru.utils.Number;
import com.luoru.utils.FormatterTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public boolean addOrder(Order order) {
        //设置订单其他属性
        order.setOrderNumber(Number.getOrderNumber(order.getOrderUserId()));
        order.setOrderType(0);
        order.setOrderTime(FormatterTime.getNowDate());
        int type = orderMapper.insertOrder(order);
        return type == 1;
    }

    @Override
    public ArrayList<Order> getUserAllOrders(int userId) {
        ArrayList<Order> allOrders = orderMapper.findAllOrders(userId);
        return allOrders;
    }

}
