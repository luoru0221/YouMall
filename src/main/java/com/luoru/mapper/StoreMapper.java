package com.luoru.mapper;

import com.luoru.pojo.Store;

/**
 * @author: Luoru
 * @date: 2020/1/12 16:32
 * @description: Store持久层接口
 */
public interface StoreMapper {

    /**
     * 添加商家
     * @param store 待添加的商家
     */
    void insertStore(Store store);
}
