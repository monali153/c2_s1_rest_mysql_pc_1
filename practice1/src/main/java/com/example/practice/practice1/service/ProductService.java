package com.example.practice.practice1.service;

import com.example.practice.practice1.domain.Product;

import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);
    public List<Product> getAllProducts();
    public Product getProductById(int productId);
    public boolean deleteProductById(int productId);
}
