package com.kaishengit.service.impl;

import com.kaishengit.entity.Product;
import com.kaishengit.service.ProductService;
import com.kaishengit.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by hoyt on 2017/10/31.
 */
public class ProductServiceImplTest extends BaseTest{

    @Autowired
    private ProductService productService;

    @Test
    public void save(){
        Product product = new Product();
        product.setProductName("速腾");
        product.setProductInventory(100);
        productService.save(product);
        System.out.println(product);
    }

}