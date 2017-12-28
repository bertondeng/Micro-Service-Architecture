package com.austin.repository;

import com.austin.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Austin on 2017/12/28.
 */
@Repository
public class ProductDataRepository {

    private static List<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "健康险", "1201"));
        products.add(new Product(2, "重疾险", "1202"));
        products.add(new Product(3, "财产险", "1203"));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
