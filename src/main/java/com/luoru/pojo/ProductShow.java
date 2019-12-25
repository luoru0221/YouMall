package com.luoru.pojo;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/22 23:58
 *  @Description: 首页商品展示
 */
public class ProductShow {

    private String showGroupName;
    private ArrayList<Product> products;

    public String getShowGroupName() {
        return showGroupName;
    }

    public void setShowGroupName(String showGroupName) {
        this.showGroupName = showGroupName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "ProductShow{" +
                "showGroupName='" + showGroupName + '\'' +
                ", products=" + products +
                '}';
    }
}
