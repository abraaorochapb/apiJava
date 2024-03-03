package com.abraaorochapb.apiJava.controllers;

import com.abraaorochapb.apiJava.domain.product.Product;
import com.abraaorochapb.apiJava.domain.product.ProductRepository;
import com.abraaorochapb.apiJava.domain.product.ValidProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity getAllProducts() {
        var allProducts = productRepository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity saveProduct(@RequestBody @Validated ValidProduct validProduct) {
        Product product = new Product(validProduct);
        System.out.println(product);
        productRepository.save(product);
        return ResponseEntity.ok(product);
    }
}
