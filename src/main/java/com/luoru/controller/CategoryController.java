package com.luoru.controller;

import com.luoru.pojo.Category;
import com.luoru.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @ResponseBody
    @RequestMapping("/all")
    public Category getAllCategory(){
        Category category = new Category();
        category.setCategoryId(0);
        categoryService.getAllCategory(category);
        return category;
    }



}
