package com.luoru.service.impl;

import com.luoru.mapper.ProductMapper;
import com.luoru.pojo.Product;
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

    @Override
    public Product addProduct(Product product) {
        productMapper.insertProduct(product);
        return product;
    }

    @Override
    public ArrayList<Product> findProductsByStore(int storeId) {
        return productMapper.findProductsByStore(storeId);
    }

    @Override
    public boolean updateProduct(Product product) {
        int type = productMapper.updateProduct(product);
        return type == 1;
    }

    @Override
    public int deleteProducts(int[] productsId) {
        return productMapper.deleteProducts(productsId);
    }


}
