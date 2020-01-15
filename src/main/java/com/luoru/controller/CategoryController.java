package com.luoru.controller;

import com.luoru.pojo.Category;
import com.luoru.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/12 22:35
 *  @Description: 商品分类Controller层
 */
@CrossOrigin
@Controller
@RequestMapping(path = "/category")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    /**
     * 查询所有的分类信息
     * @return 所有分类信息
     */
    @ResponseBody
    @RequestMapping("/all")
    public Category getAllCategory(){
        Category category = new Category();
        category.setCategoryId(0);
        categoryService.getAllCategory(category);
        return category;
    }

    /**
     * 查询三级分类
     * @param thirdCategoryId 第三级分类Id
     * @return 三级分类信息
     */
    @ResponseBody
    @RequestMapping("/three")
    ArrayList<Category> getThreeCategory(int thirdCategoryId){
        return categoryService.getThreeCategory(thirdCategoryId);
    }

}
