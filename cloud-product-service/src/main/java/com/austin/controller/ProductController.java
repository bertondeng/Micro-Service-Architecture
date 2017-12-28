package com.austin.controller;

import com.austin.domain.Product;
import com.austin.service.ProductDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by denghao0706 on 2017/12/14.
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductDataService productDataService;

    @GetMapping("/list")
    public List<Integer> list() {
        return Arrays.asList(1, 2, 3, 4);
    }

    @GetMapping(value = "/{productId}", produces = "application/json")
    public Product getProduct(@PathVariable("productId") Integer productId) {
        return productDataService.getProduct(productId);
    }

}
