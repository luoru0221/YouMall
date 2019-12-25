package com.luoru.service.impl;

import com.luoru.mapper.ProductMapper;
import com.luoru.pojo.ProductShow;
import com.luoru.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public ArrayList<ProductShow> getShowProduct() {
        return productMapper.getShowProduct();
    }

}
