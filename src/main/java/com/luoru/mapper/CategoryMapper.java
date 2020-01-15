package com.luoru.mapper;

import com.luoru.pojo.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/11 14:55
 *  @Description: CategoryMapper持久层接口
 */
@Repository
public interface CategoryMapper {

    /**
     * 查询下级分类
     * @param categoryFid 父级分类Id
     * @return 所有的下级分类
     */
    ArrayList<Category> findChildrenCategory(int categoryFid);

    /**
     * 根据分类Id查询分类
     * @param categoryId 分类Id
     * @return 分类信息
     */
    Category findCategoryById(int categoryId);

}
