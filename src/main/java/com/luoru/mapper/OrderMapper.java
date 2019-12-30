package com.luoru.mapper;

import com.luoru.pojo.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @author: Luoru
 * @Date: 2019/12/27 1:14
 * @Description: Order持久层
 */
@Repository
public interface OrderMapper {


    /**
     * 添加订单
     * @param order 待添加的订单
     * @return SQL执行状态码
     */
    int insertOrder(Order order);

    /**
     * 根据UserId查询所有订单
     * @param UserId 用户的Id
     * @return 该用户的所有订单
     */
    ArrayList<Order> findAllOrders(int UserId);


}
