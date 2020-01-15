package com.luoru.controller;

import com.luoru.pojo.Store;
import com.luoru.service.impl.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Luoru
 * @date: 2020/1/12 17:03
 * @description: Store表现层
 */
@CrossOrigin
@Controller
@RequestMapping(path = "/store")
public class StoreController {

    @Autowired
    private StoreServiceImpl storeService;

    /**
     * 商家入驻
     * @param store 待入驻的商家信息
     * @return 入驻后的商家
     */
    @ResponseBody
    @RequestMapping(path = "/enter")
    public Store storeEnter(@RequestBody Store store){
        return storeService.addStore(store);
    }

    /**
     * 加载个人店铺信息
     * @param userId 待加载的店铺的用户信息
     * @return 店铺
     */
    @ResponseBody
    @RequestMapping(path = "/load")
    public Store loadStore(int userId){
        return storeService.findStoreByUserId(userId);
    }

    /**
     * 修改店铺信息
     * @param store 待修改的店铺
     * @return 是否修改成功
     */
    @ResponseBody
    @RequestMapping(path = "/update")
    public boolean updateStore(@RequestBody Store store){
        return storeService.updateStore(store);
    }


}
