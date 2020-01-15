package com.luoru.service.impl;

import com.luoru.mapper.CategoryMapper;
import com.luoru.pojo.Category;
import com.luoru.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/12 14:45
 *  @Description: Category业务层
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void getAllCategory(Category category) {

        ArrayList<Category> childrenCategory = categoryMapper.findChildrenCategory(category.getCategoryId());
        category.setChildrenCategory(childrenCategory);
        for (Category childCategory : childrenCategory) {
            if (childCategory != null) {
                getAllCategory(childCategory);
            }
        }
    }

    @Override
    public ArrayList<Category> getThreeCategory(int thirdCategoryId) {

        ArrayList<Category> threeCategory = new ArrayList<>();
        //由第三级分类Id查询第三级分类
        Category thirdCategory = categoryMapper.findCategoryById(thirdCategoryId);
        //由第三级分类的父级分类Id查询第二级分类
        Category secondCategory= categoryMapper.findCategoryById(thirdCategory.getCategoryFid());
        ArrayList<Category> thirdCategories = categoryMapper.findChildrenCategory(secondCategory.getCategoryId());
        secondCategory.setChildrenCategory(thirdCategories);
        //由第二级分类的父级分类Id查询第一级分类
        Category firstCategory = categoryMapper.findCategoryById(secondCategory.getCategoryFid());
        ArrayList<Category> secondCategories = categoryMapper.findChildrenCategory(firstCategory.getCategoryId());
        firstCategory.setChildrenCategory(secondCategories);

        threeCategory.add(firstCategory);
        threeCategory.add(secondCategory);
        threeCategory.add(thirdCategory);

        return threeCategory;
    }

}
