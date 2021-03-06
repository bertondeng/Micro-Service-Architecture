package com.austin.remote.service;

import com.austin.domain.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Austin on 2017/12/14.
 */

@FeignClient(name = "productService")
public interface ProductService {
    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<Integer> list();

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
    Product getProduct(@PathVariable("productId") Integer productId);
}
