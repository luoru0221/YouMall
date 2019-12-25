package com.luoru.controller;

import com.luoru.pojo.ProductShow;
import com.luoru.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;


/**
 *  @author: Luoru
 *  @Date: 2019/12/21 17:22
 *  @Description: ProductController接口
 */
@CrossOrigin
@Controller
@RequestMapping(path = "product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @ResponseBody
    @RequestMapping(path = "show")
    public ArrayList<ProductShow> getShowProduct(){
        return productService.getShowProduct();
    }

}
