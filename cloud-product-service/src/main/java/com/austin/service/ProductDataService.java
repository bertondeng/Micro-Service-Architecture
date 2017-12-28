package com.austin.service;

import com.austin.domain.Product;
import com.austin.repository.ProductDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * Created by Austin on 2017/12/28.
 */
@Service
public class ProductDataService {
    @Autowired
    private ProductDataRepository productDataRepository;


    public Product getProduct(Integer productId) {


        List<Product> productList = productDataRepository.getAllProducts();
        for (Product p : productList) {
            if (Objects.equals(p.getId(), productId)) return p;
        }
        throw new RuntimeException("产品ID不存在");
    }
}
