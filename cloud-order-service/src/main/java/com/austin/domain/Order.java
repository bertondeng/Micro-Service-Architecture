package com.austin.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

/**
 * Created by Austin on 2017/12/14.
 */
public class Order {

    private Integer orderNo;
    private Integer productId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dealTime;

    public Order() {
    }

    public Order(Integer orderNo, Integer productId, LocalDateTime dealTime) {
        this.orderNo = orderNo;
        this.productId = productId;
        this.dealTime = dealTime;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public LocalDateTime getDealTime() {
        return dealTime;
    }

    public void setDealTime(LocalDateTime dealTime) {
        this.dealTime = dealTime;
    }
}
