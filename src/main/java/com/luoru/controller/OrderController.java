package com.luoru.controller;

import com.luoru.pojo.Order;
import com.luoru.pojo.OrderItem;
import com.luoru.pojo.User;
import com.luoru.service.impl.OrderItemServiceImpl;
import com.luoru.service.impl.OrderServiceImpl;
import com.luoru.utils.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @author: Luoru
 * @Date: 2019/12/29 2:06
 * @Description: Order表现层
 */
@CrossOrigin
@Controller
@RequestMapping(path = "/order")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;
    @Autowired
    private OrderItemServiceImpl orderItemService;

    /**
     * 添加订单
     *
     * @param order 待添加的Order
     * @return 添加是否成功
     */
    @ResponseBody
    @RequestMapping(path = "submit")
    public Order submitOrder(@RequestBody Order order) {
        //保存订单
        boolean addOrderSuccess = orderService.addOrder(order);
        if (addOrderSuccess) {
            //保存订单项
            for (OrderItem orderItem : order.getOrderItems()) {
                orderItem.setOrderItemOrderId(order.getOrderId());
                orderItem.setOrderItemNumber(Number.getOrderItemNumber(order.getOrderUserId()));
                boolean addOrderItemSuccess = orderItemService.addOrderItem(orderItem);
                if (!addOrderItemSuccess) {
                    return null;
                }
            }
        }
        return order;
    }

    /**
     * 加载用户所有的订单
     * @param user 用户
     * @return 用户所有订单
     */
    @ResponseBody
    @RequestMapping(path = "/allOrders")
    public ArrayList<Order> getUserAllOrders(@RequestBody User user){
        return orderService.getUserAllOrders(user.getUserId());
    }

}
