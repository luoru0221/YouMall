package com.luoru.pojo;

import java.util.ArrayList;

/**
 *  @author: Luoru
 *  @Date: 2019/12/11 14:30
 *  @Description: 商品分类实体类
 */
public class Category {
    private int categoryId;
    private String categoryName;
    private int categoryFid;

    private ArrayList<Category> childrenCategory;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryFid() {
        return categoryFid;
    }

    public void setCategoryFid(int categoryFid) {
        this.categoryFid = categoryFid;
    }

    public ArrayList<Category> getChildrenCategory() {
        return childrenCategory;
    }

    public void setChildrenCategory(ArrayList<Category> childrenCategory) {
        this.childrenCategory = childrenCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryFid=" + categoryFid +
                ", childrenCategory=" + childrenCategory +
                '}';
    }
}
