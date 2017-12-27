package com.austin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * Created by denghao0706 on 2017/12/14.
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@ComponentScan("com.austin")
public class OrderServiceApplication {

    public static void main(String[] args){
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
