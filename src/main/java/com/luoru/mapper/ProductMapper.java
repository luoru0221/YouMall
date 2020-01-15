package com.luoru.mapper;

import com.luoru.pojo.Product;
import com.luoru.pojo.ProductShow;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author: Luoru
 * @Date: 2019/12/10 14:59
 * @Description: Product持久层接口
 */
@Repository
public interface ProductMapper {

    /**
     * 根据id查询商品信息
     *
     * @param productId 商品id
     * @return Product对象
     */
    Product findProductById(int productId);

    /**
     * 查找所有首页展示的商品
     *
     * @return 所有展示商品对应的分组信息
     */
    @MapKey("show_group_name")
    ArrayList<ProductShow> getShowProduct();

    /**
     * 添加商品到购物车
     * @param product 待添加的商品
     */
    void insertProduct(Product product);

    /**
     * 查训指定商家的所有商品
     * @param storeId 商家Id
     * @return 商家的所有商品
     */
    ArrayList<Product> findProductsByStore(int storeId);

    /**
     * 修改商品
     * @param product 待修改的商品
     * @return SQL执行状态
     */
    int updateProduct(Product product);

    /**
     * 批量删除商品
     * @param productsId 待删除的商品Id
     * @return SQL执行状态
     */
    int deleteProducts(int[] productsId);

}
