package com.luoru.service;

import com.luoru.pojo.Category;

import java.util.ArrayList;

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

    /**
     * 由第三级分类Id得到三级分类
     * @param thirdCategoryId 第三级分类Id
     * @return 三级分类
     */
    ArrayList<Category> getThreeCategory(int thirdCategoryId);

}
