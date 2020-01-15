package com.luoru.service.impl;

import com.luoru.mapper.StoreMapper;
import com.luoru.mapper.UserMapper;
import com.luoru.pojo.Store;
import com.luoru.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Luoru
 * @date: 2020/1/12 16:59
 * @description: Store业务层
 */
@Service("storeService")
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public Store addStore(Store store) {
        userMapper.updateUserType(store.getStoreUserId());
        storeMapper.insertStore(store);
        return store;
    }

    @Override
    public Store findStoreByUserId(int userId) {
        return storeMapper.findStoreByUserId(userId);
    }

    @Override
    public boolean updateStore(Store store) {
        int type = storeMapper.updateStore(store);
        return type==1;
    }
}
