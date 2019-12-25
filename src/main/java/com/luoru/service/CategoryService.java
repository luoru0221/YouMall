package com.luoru.service;

import com.luoru.pojo.Category;

/**
 *  @author: Luoru
 *  @Date: 2019/12/21 14:20
 *  @Description: CategoryService接口
 */
public interface CategoryService {

    /**
     * 得到所有的分类信息
     * @param category 所有分类信息
     */
    void getAllCategory(Category category);

}
