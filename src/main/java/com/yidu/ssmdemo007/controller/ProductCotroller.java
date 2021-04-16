package com.yidu.ssmdemo007.controller;

import com.yidu.ssmdemo007.bean.Product;
import com.yidu.ssmdemo007.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductCotroller {

    @Autowired
    ProductService productService;

    @RequestMapping("sele")
    @ResponseBody
    public  Product sele(int pid){
        return  productService.select(pid);
    }

    @RequestMapping("adds")
    @ResponseBody
    public  int adds(Product product){
        return productService.adds(product);
    }


}
