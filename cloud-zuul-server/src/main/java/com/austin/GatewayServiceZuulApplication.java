package com.austin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by denghao0706 on 2017/12/18.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class GatewayServiceZuulApplication {

    public static void main(String[] args){
        SpringApplication.run(GatewayServiceZuulApplication.class, args);
    }
}
