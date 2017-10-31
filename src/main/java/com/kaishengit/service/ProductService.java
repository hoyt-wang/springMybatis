package com.kaishengit.service;

import com.kaishengit.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hoyt on 2017/10/31.
 */
public interface ProductService {

    void save(Product product);
}
