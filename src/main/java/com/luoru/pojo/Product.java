package com.luoru.pojo;

import java.io.Serializable;

/**
 *  @author: Luoru
 *  @Date: 2019/12/8 15:16
 *  @Description: 商品实体类
 */
public class Product implements Serializable {

    private int productId;
    private String productName;
    private String productIntroduction;
    private int productCategory;
    private int productStore;
    private String productImage;
    private int productStock;
    private double productPrice;
    private int isShelves;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductIntroduction() {
        return productIntroduction;
    }

    public void setProductIntroduction(String productIntroduction) {
        this.productIntroduction = productIntroduction;
    }

    public int getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(int productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStore() {
        return productStore;
    }

    public void setProductStore(int productStore) {
        this.productStore = productStore;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getIsShelves() {
        return isShelves;
    }

    public void setIsShelves(int isShelves) {
        this.isShelves = isShelves;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productIntroduction='" + productIntroduction + '\'' +
                ", productCategory=" + productCategory +
                ", productStore=" + productStore +
                ", productImage='" + productImage + '\'' +
                ", productStock=" + productStock +
                ", productPrice=" + productPrice +
                ", isShelves=" + isShelves +
                '}';
    }
}
