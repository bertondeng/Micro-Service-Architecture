package com.austin.controller;

import com.austin.domain.Order;
import com.austin.remote.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * Created by Austin on 2017/12/14.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private final ProductService productService;

    @Autowired
    public OrderController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/{orderNo}", produces = "application/json")
    public Order orderDetail(@PathVariable("orderNo")Integer orderNo){
        Order order = new Order();
        order.setOrderNo(orderNo);
        order.setProductId(productService.list().get(0));
        order.setDealTime(LocalDateTime.now());
        return order;
    }
}
