package com.luoru.pojo;

import java.io.Serializable;

/**
 * @author: Luoru
 * @Date: 2019/12/27 0:36
 * @Description: 订单项实体类
 */
public class OrderItem implements Serializable {

    private int orderItemId;  //订单项Id
    private int orderItemOrderId; //订单Id
    private String orderItemNumber; //订单项编号
    private int orderItemProductId; //商品Id
    private int orderItemProductAmount;//商品数量
    private Product orderItemProduct; //商品

    public Product getOrderItemProduct() {
        return orderItemProduct;
    }

    public void setOrderItemproduct(Product orderItemProduct) {
        this.orderItemProduct = orderItemProduct;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getOrderItemOrderId() {
        return orderItemOrderId;
    }

    public void setOrderItemOrderId(int orderItemOrderId) {
        this.orderItemOrderId = orderItemOrderId;
    }

    public String getOrderItemNumber() {
        return orderItemNumber;
    }

    public void setOrderItemNumber(String orderItemNumber) {
        this.orderItemNumber = orderItemNumber;
    }

    public int getOrderItemProductId() {
        return orderItemProductId;
    }

    public void setOrderItemProductId(int orderItemProductId) {
        this.orderItemProductId = orderItemProductId;
    }

    public int getOrderItemProductAmount() {
        return orderItemProductAmount;
    }

    public void setOrderItemProductAmount(int orderItemProductAmount) {
        this.orderItemProductAmount = orderItemProductAmount;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", orderItemOrderId=" + orderItemOrderId +
                ", orderItemNumber='" + orderItemNumber + '\'' +
                ", orderItemProductId=" + orderItemProductId +
                ", orderItemProductAmount=" + orderItemProductAmount +
                ", orderItemProduct=" + orderItemProduct +
                '}';
    }

}
