package com.luoru.pojo;

/**
 *  @author: Luoru
 *  @Date: 2019/12/27 10:58
 *  @Description: 地址实体类
 */
public class Address {

    private int addressId;  //地址Id
    private int userId; //创建该地址的用户
    private String province; //省份，直辖市
    private String city; //市，地区
    private String county;  //县
    private String fullAddress; //详细地址
    private String receiveUserName; //收件人姓名
    private String receiveUserPhone; //收件人手机
    private String receiveUserEmail;  //收件人邮箱

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getReceiveUserName() {
        return receiveUserName;
    }

    public void setReceiveUserName(String receiveUserName) {
        this.receiveUserName = receiveUserName;
    }

    public String getReceiveUserPhone() {
        return receiveUserPhone;
    }

    public void setReceiveUserPhone(String receiveUserPhone) {
        this.receiveUserPhone = receiveUserPhone;
    }

    public String getReceiveUserEmail() {
        return receiveUserEmail;
    }

    public void setReceiveUserEmail(String receiveUserEmail) {
        this.receiveUserEmail = receiveUserEmail;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", userId=" + userId +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                ", receiveUserName='" + receiveUserName + '\'' +
                ", receiveUserPhone='" + receiveUserPhone + '\'' +
                ", receiveUserEmail='" + receiveUserEmail + '\'' +
                '}';
    }
}
