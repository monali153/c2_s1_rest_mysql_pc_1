package com.example.practice.practice1.controller;

import com.example.practice.practice1.domain.Product;
import com.example.practice.practice1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products/v1/")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/product")
    public ResponseEntity<?> saveProduct(@RequestBody Product product){

        return new ResponseEntity<>(productService.addProduct(product), HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<?> getProductDetails(){
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<?> getProductDetailsById(@PathVariable int productId){
        return new ResponseEntity<>(productService.getProductById(productId),HttpStatus.FOUND);
    }

    @DeleteMapping("/product/{productId}")
    public ResponseEntity<?> deleteProductById(@PathVariable int productId){
        return new ResponseEntity<>(productService.deleteProductById(productId),HttpStatus.OK);
    }
}
