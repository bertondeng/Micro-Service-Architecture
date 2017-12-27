package com.austin.controller;

import com.austin.domain.Order;
import com.austin.remote.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

/**
 * Created by Austin on 2017/12/14.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private final ProductService productService;

    private final RestTemplate restTemplate;

    @Autowired
    public OrderController(ProductService productService, RestTemplate restTemplate) {
        this.productService = productService;
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/{orderNo}", produces = "application/json")
    public Order orderDetail(@PathVariable("orderNo") Integer orderNo) {
        Order order = new Order();
        order.setOrderNo(orderNo);
        order.setProductId(productService.list().get(0));
        order.setDealTime(LocalDateTime.now());
        return order;
    }

    @GetMapping(value = "/load/balance", produces = "application/json")
    public String order() {
        return restTemplate.getForObject("http://productService/product/list", String.class);
    }
}
