package com.luoru.service;

import com.luoru.pojo.Order;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/29 2:13
 *  @Description: Order业务层接口
 */
public interface OrderService {


    /**
     * 添加订单至数据库
     * @param order 待添加的订单
     * @return 订单是否添加成功
     */
    boolean addOrder(Order order);

    /**
     * 用户的所有订单
     * @param userId 用户Id
     * @return 该用户的所有订单
     */
    ArrayList<Order> getUserAllOrders(int userId);

}
