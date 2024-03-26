package io.github.gregatemi.productservice.service;

import java.util.List;

import io.github.gregatemi.productservice.model.ProductCreateRequest;
import io.github.gregatemi.productservice.model.ProductCreateResponse;

public interface ProductService {

    ProductCreateResponse createProduct(ProductCreateRequest productCreateRequest);

    List<ProductCreateResponse> findAll();

    ProductCreateResponse findById(Integer productId);
    
}
