package io.github.gregatemi.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.gregatemi.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{
    
}
