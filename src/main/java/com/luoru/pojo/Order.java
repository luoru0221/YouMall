package com.luoru.pojo;

import java.util.ArrayList;
import java.util.Date;

/**
 *  @author: Luoru
 *  @Date: 2019/12/27 0:36
 *  @Description: 订单实体类
 */
public class Order {

    private int orderId;  //订单Id
    private int orderUserId;  //用户Id
    private String orderNumber;  //订单编号
    private String orderUserName;  //订单收件人姓名
    private String orderUserAddress;  //订单地址
    private String orderUserPhone;  //订单收件人手机
    private String orderUserEmail;  //订单收件人邮箱
    private double orderMoney;  //订单总价
    private String orderTime;  //订单时间
    private int orderType;  //订单状态
    private ArrayList<OrderItem> orderItems;  //订单项

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(int orderUserId) {
        this.orderUserId = orderUserId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderUserName() {
        return orderUserName;
    }

    public void setOrderUserName(String orderUserName) {
        this.orderUserName = orderUserName;
    }

    public String getOrderUserAddress() {
        return orderUserAddress;
    }

    public void setOrderUserAddress(String orderUserAddress) {
        this.orderUserAddress = orderUserAddress;
    }

    public String getOrderUserPhone() {
        return orderUserPhone;
    }

    public void setOrderUserPhone(String orderUserPhone) {
        this.orderUserPhone = orderUserPhone;
    }

    public String getOrderUserEmail() {
        return orderUserEmail;
    }

    public void setOrderUserEmail(String orderUserEmail) {
        this.orderUserEmail = orderUserEmail;
    }

    public double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderUserId=" + orderUserId +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderUserName='" + orderUserName + '\'' +
                ", orderUserAddress='" + orderUserAddress + '\'' +
                ", orderUserPhone='" + orderUserPhone + '\'' +
                ", orderUserEmail='" + orderUserEmail + '\'' +
                ", orderMoney=" + orderMoney +
                ", orderTime=" + orderTime +
                ", orderType=" + orderType +
                ", orderItems=" + orderItems +
                '}';
    }
}
