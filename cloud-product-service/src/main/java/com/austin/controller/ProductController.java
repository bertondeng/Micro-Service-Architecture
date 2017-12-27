package com.austin.controller;

import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/list")
    public List<Integer> list() {
        return Arrays.asList(1, 2, 3, 4);
    }
}
