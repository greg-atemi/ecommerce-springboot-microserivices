package io.github.gregatemi.orderservice.service;

import io.github.gregatemi.orderservice.model.OrderRequest;

public interface OrderService {

    String placeOrder(OrderRequest orderRequest);
    
}
