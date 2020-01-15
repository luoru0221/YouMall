package com.luoru.service;

import com.luoru.pojo.Store;

/**
 * @author: Luoru
 * @date: 2020/1/12 16:59
 * @description: Store业务层接口
 */
public interface StoreService {

    /**
     * 添加店铺
     *
     * @param store 待添加的店铺
     * @return 生成主键后的店铺
     */
    Store addStore(Store store);

    /**
     * 查询用户的店铺
     *
     * @param userId 用户Id
     * @return 店铺
     */
    Store findStoreByUserId(int userId);

    /**
     * 修改店铺信息
     *
     * @param store 待修改的店铺
     * @return 是否修改成功
     */
    boolean updateStore(Store store);
}
