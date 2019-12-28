package com.luoru.service.impl;

import com.luoru.mapper.AddressMapper;
import com.luoru.pojo.Address;
import com.luoru.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public ArrayList<Address> getMyAllAddress(int userId) {
        return addressMapper.findAddressByUserId(userId);
    }

    @Override
    public int addNewAddress(Address address) {
        addressMapper.insertAddress(address);
        return address.getAddressId();
    }

    @Override
    public boolean updateAddress(Address address) {
        int type = addressMapper.updateAddress(address);
        return type == 1;
    }

    @Override
    public boolean deleteAddress(Address address) {
        int type = addressMapper.deleteAddress(address);
        return type == 1;
    }

    @Override
    public int findDefaultAddress(int userId) {
        return addressMapper.findDefaultAddress(userId);
    }

    @Override
    public boolean updateDefaultAddress(int userId, int addressId) {
        int type = addressMapper.updateDefaultAddress(userId, addressId);
        return type == 1;
    }
}
