package com.luoru.service;

import com.luoru.pojo.Product;
import com.luoru.pojo.ProductShow;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/21 17:25
 *  @Description: ProductService接口
 */
public interface ProductService {

    /**
     * 查找首页展示的商品
     * @return 首页展示商品
     */
    ArrayList<ProductShow> getShowProduct();

    /**
     * 添加商品
     * @param product 待添加的商品
     * @return 添加后的商品
     */
    Product addProduct(Product product);

    /**
     * 查找商家的所有的商品
     * @param storeId 商家Id
     * @return 商家的所有商品
     */
    ArrayList<Product> findProductsByStore(int storeId);

    /**
     * 修改商品信息
     * @param product 待修改的商品
     * @return 修改成功与否
     */
    boolean updateProduct(Product product);

    /**
     * 删除多件商品
     * @param productsId 待删除的商品Id
     * @return 删除的商品数
     */
    int deleteProducts(int[] productsId);

}
