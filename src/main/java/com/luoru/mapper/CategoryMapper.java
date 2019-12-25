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

    ArrayList<Category> findChildrenCategory(int categoryFid);

}
