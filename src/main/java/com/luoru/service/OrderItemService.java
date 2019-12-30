package com.luoru.service;

import com.luoru.pojo.OrderItem;

/**
 * @author: Luoru
 * @Date: 2019/12/29 2:12
 * @Description: OrderItem业务层接口
 */
public interface OrderItemService {

    /**
     * 添加订单项
     * @param orderItem 待添加的订单项
     * @return 添加是否成功
     */
    boolean addOrderItem(OrderItem orderItem);

}
