package com.luoru.mapper;

import com.luoru.pojo.Store;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * @author: Luoru
 * @date: 2020/1/12 16:32
 * @description: Store持久层接口
 */
@Repository
public interface StoreMapper {

    /**
     * 添加商家
     * @param store 待添加的商家
     */
    void insertStore(Store store);

    /**
     * 查询用户的店铺
     * @param UserId 用户Id
     * @return 店铺
     */
    Store findStoreByUserId(int UserId);

    /**
     * 修改店铺信息
     * @param store 待修改的店铺
     * @return 影响的数据条数
     */
    int updateStore(Store store);
}
