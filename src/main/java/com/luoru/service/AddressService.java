package com.luoru.service;

import com.luoru.pojo.Address;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/28 1:17
 *  @Description: Address业务层接口
 */
public interface AddressService {

    /**
     * 查找某一用户的所有地址
     * @param userId 用户Id
     * @return 该用户的所有地址
     */
    ArrayList<Address> getMyAllAddress(int userId);

    /**
     * 添加新的地址
     * @param address 需添加的新地址
     * @return 新添加的地址的id
     */
    int addNewAddress(Address address);

    /**
     * 更新地址
     * @param address 更新后的地址
     * @return 是否更新成功
     */
    boolean updateAddress(Address address);

    /**
     * 删除地址
     * @param address 需删除的地址
     * @return 是否删除成功
     */
    boolean deleteAddress(Address address);

    /**
     * 查询用户的默认地址
     * @param userId 用户Id
     * @return 用户的默认地址Id
     */
    int findDefaultAddress(int userId);

    /**
     * 修改用户默认地址
     * @param userId 用户Id
     * @param addressId 新的默认地址
     * @return 是否修改成功
     */
    boolean updateDefaultAddress(int userId,int addressId);


}
