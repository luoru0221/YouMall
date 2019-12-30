package com.luoru.utils;

/**
 *  @author: Luoru
 *  @Date: 2019/12/29 2:45
 *  @Description: 生成编号工具类
 */
public class Number {

    /**
     * 生成订单编号
     * @param userId 用户Id
     * @return 生成的订单编号
     */
    public static String getOrderNumber(int userId){
        String userIdFormat = String.format("%05d", userId);
        String timeCut = System.currentTimeMillis() + "";
        return "RuL"+timeCut.substring(7)+userIdFormat;
    }

    /**
     * 生成订单项编号
     * @param userId 用户Id
     * @return 生成的订单项编号
     */
    public static String getOrderItemNumber(int userId){
        String userIdFormat = String.format("%05d", userId);
        String timeCut = System.currentTimeMillis() + "";
        return timeCut+userIdFormat;
    }
}
