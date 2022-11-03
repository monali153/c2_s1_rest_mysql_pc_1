package com.example.practice.practice1.repository;

import com.example.practice.practice1.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Product findByProductId(int productId);
}
