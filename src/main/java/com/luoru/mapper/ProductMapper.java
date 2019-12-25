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
    public Product findProductById(int productId);

    /**
     * 查找所有首页展示的商品
     *
     * @return 所有展示商品对应的分组信息
     */
    @MapKey("show_group_name")
    public ArrayList<ProductShow> getShowProduct();

}
