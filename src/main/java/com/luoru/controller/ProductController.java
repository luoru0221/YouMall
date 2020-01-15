package com.luoru.controller;

import com.luoru.pojo.Product;
import com.luoru.pojo.ProductShow;
import com.luoru.service.impl.ProductServiceImpl;
import com.luoru.utils.ImageUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;


/**
 *  @author: Luoru
 *  @Date: 2019/12/21 17:22
 *  @Description: ProductController接口
 */
@CrossOrigin
@Controller
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    /**
     * 查询首页展示的商品
     * @return 首页展示的商品列表
     */
    @ResponseBody
    @RequestMapping(path = "/show")
    public ArrayList<ProductShow> getShowProduct(){
        return productService.getShowProduct();
    }

    /**
     * 上传商品图片
     * @param request HTTPServletRequest
     * @return 商品路径
     */
    @ResponseBody
    @RequestMapping(path = "/upload")
    public String uploadImage(HttpServletRequest request){
        String imagePath = ImageUploadUtil.upLoadImg(request);
        return imagePath;
    }

    /**
     * 添加商品
     * @param product 待添加的商品
     * @return 添加成功后的商品
     */
    @ResponseBody
    @RequestMapping(path = "/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    /**
     * 加载商家的所有商品
     * @param storeId 商家的Id
     * @return 商家的所有商品
     */
    @ResponseBody
    @RequestMapping(path = "/load")
    public ArrayList<Product> loadProducts(int storeId){
        return productService.findProductsByStore(storeId);
    }

    /**
     * 修改商品信息
     * @param product 待修改的是商品
     * @return 修改成功与否
     */
    @ResponseBody
    @RequestMapping(path = "/update")
    public boolean updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    /**
     * 批量删除商品
     * @param productsId 待删除的商品Id
     * @return 成功删除的商品数
     */
    @ResponseBody
    @RequestMapping(path = "/delete")
    public int deleteProducts(@RequestBody int[] productsId){
        return productService.deleteProducts(productsId);
    }


}
