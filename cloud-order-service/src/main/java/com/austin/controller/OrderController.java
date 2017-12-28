package com.austin.controller;

import com.austin.domain.Order;
import com.austin.domain.Product;
import com.austin.remote.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by Austin on 2017/12/14.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private static List<Order> orders;

    static {
        orders = new ArrayList<>();
        orders.add(new Order(1, 1, LocalDateTime.of(2017, 11, 5, 5, 30)));
        orders.add(new Order(2, 1, LocalDateTime.of(2017, 2, 11, 5, 30)));
        orders.add(new Order(3, 2, LocalDateTime.of(2017, 3, 7, 5, 30)));
        orders.add(new Order(4, 3, LocalDateTime.of(2017, 4, 1, 5, 30)));
        orders.add(new Order(5, 2, LocalDateTime.of(2017, 8, 2, 5, 30)));
    }

    @Autowired
    private ProductService productService;

    @Autowired
    @LoadBalanced
    private RestTemplate loadBalancedRestTemplate;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/{orderNo}", produces = "application/json")
    public Order orderDetail(@PathVariable("orderNo") Integer orderNo) {
        Optional<Order> first = orders.stream().filter(x -> Objects.equals(x.getOrderNo(), orderNo)).findFirst();
        return first.orElse(null);
    }

    @GetMapping(value = "/{orderNo}/product", produces = "application/json")
    public Product getOrderProductInformation(@PathVariable("orderNo") Integer orderNo){
        Optional<Order> first = orders.stream().filter(x -> Objects.equals(x.getOrderNo(), orderNo)).findFirst();
        if(first.isPresent()){
            Order order = first.get();
            return productService.getProduct(order.getProductId());
        }
        return null;
    }
    @GetMapping(value = "/load/balance", produces = "application/json")
    public String order() {
        return loadBalancedRestTemplate.getForObject("http://productService/product/list", String.class);
    }
}
