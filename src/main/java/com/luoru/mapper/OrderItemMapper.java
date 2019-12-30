package com.luoru.mapper;

import com.luoru.pojo.OrderItem;
import org.springframework.stereotype.Repository;

/**
 *  @author: Luoru
 *  @Date: 2019/12/27 1:15
 *  @Description: OrderItem持久层接口
 */
@Repository
public interface OrderItemMapper {

    /**
     * 添加订单项
     * @param orderItem 需添加的订单项
     * @return SQL执行状态
     */
    int insertOrderItem(OrderItem orderItem);

}
