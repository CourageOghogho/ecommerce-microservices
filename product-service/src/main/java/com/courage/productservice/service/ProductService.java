package com.courage.productservice.service;

import com.courage.productservice.dto.ProductRequest;
import com.courage.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
