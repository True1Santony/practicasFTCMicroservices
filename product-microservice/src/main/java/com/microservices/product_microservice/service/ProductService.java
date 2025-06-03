package com.microservices.product_microservice.service;

import com.microservices.product_microservice.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    void save(Product product);

    void deleteById(String id);
}
