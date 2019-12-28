package com.luoru.pojo;

/**
 *  @author: Luoru
 *  @Date: 2019/12/16 20:36
 *  @Description: 购物车实体类
 */
public class Cart {

    private int cartId;  //购物车Id
    private int userId;  //用户Id
    private Product product;  //商品
    private int productNumber;  //商品数量


    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", product=" + product +
                ", productNumber=" + productNumber +
                '}';
    }
}
