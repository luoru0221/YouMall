package com.luoru.controller;

import com.luoru.pojo.Address;
import com.luoru.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/28 15:51
 *  @Description: Address表现层
 */
@CrossOrigin
@Controller
@RequestMapping(path = "/address")
public class AddressController {

    @Autowired
    private AddressServiceImpl addressService;

    /**
     * 添加新的收货地址
     * @param address 待添加的收货地址
     * @return 添加成功后的收货地址
     */
    @ResponseBody
    @RequestMapping(path = "/add")
    public Address addNewAddress(@RequestBody Address address) {
        if(addressService.addNewAddress(address) > 0){
            return address;
        }
        return null;
    }

    /**
     * 查询用户的所有收货地址
     * @param userId 用户Id
     * @return 用户的所有收货地址
     */
    @ResponseBody
    @RequestMapping(path = "/myAll")
    public ArrayList<Address> myAllAddress(int userId){
        return addressService.getMyAllAddress(userId);
    }

    /**
     * 修改收货地址
     * @param address 修改后的收货地址
     * @return 是否修改成功
     */
    @ResponseBody
    @RequestMapping(path = "/save")
    public boolean saveEdit(@RequestBody Address address){
        return addressService.updateAddress(address);
    }

    /**
     * 删除收货地址
     * @param address 待删除的地址
     * @return 是否删除成功
     */
    @ResponseBody
    @RequestMapping(path = "/delete")
    public boolean deleteAddress(@RequestBody Address address){
        return addressService.deleteAddress(address);
    }

    /**
     * 查询用户的默认地址
     * @param userId 用户Id
     * @return 该用户的默认地址的Id
     */
    @ResponseBody
    @RequestMapping(path = "/default")
    public int findUserDefaultAddress(int userId){
        return addressService.findDefaultAddress(userId);
    }

    /**
     * 修改用户的默认地址
     * @param userId 用户Id
     * @param addressId 地址Id
     * @return 是否修改成功
     */
    @ResponseBody
    @RequestMapping(path = "/changeDefault")
    public boolean updateDefaultAddress(int userId,int addressId){
        return addressService.updateDefaultAddress(userId, addressId);
    }

}
