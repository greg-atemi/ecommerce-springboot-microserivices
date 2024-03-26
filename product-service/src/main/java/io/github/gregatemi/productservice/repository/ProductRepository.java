package io.github.gregatemi.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.gregatemi.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    
}
