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

}
