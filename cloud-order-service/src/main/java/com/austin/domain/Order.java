package com.austin.domain;

import java.time.LocalDateTime;

/**
 * Created by denghao0706 on 2017/12/14.
 */
public class Order {

    private Integer orderNo;
    private Integer productId;
    private LocalDateTime dealTime;

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
