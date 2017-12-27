package com.austin.remote.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by denghao0706 on 2017/12/14.
 */

@FeignClient(name = "productService")
public interface ProductService {
    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    List<Integer> list();
}
