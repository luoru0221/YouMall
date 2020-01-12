package com.luoru.pojo;

/**
 * @author: Luoru
 * @date: 2020/1/12 12:03
 * @description: 店铺实体类
 */
public class Store {

    private int storeId;
    private int storeUserId;
    private String storeName;
    private String storeCompanyName;
    private String storePhone;
    private String storeAddress;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getStoreUserId() {
        return storeUserId;
    }

    public void setStoreUserId(int storeUserId) {
        this.storeUserId = storeUserId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreCompanyName() {
        return storeCompanyName;
    }

    public void setStoreCompanyName(String storeCompanyName) {
        this.storeCompanyName = storeCompanyName;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId=" + storeId +
                ", storeUserId=" + storeUserId +
                ", storeName='" + storeName + '\'' +
                ", storeCompanyName='" + storeCompanyName + '\'' +
                ", storePhone='" + storePhone + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                '}';
    }
}
