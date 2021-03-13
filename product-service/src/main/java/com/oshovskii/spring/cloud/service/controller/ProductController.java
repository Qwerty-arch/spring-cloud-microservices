package com.oshovskii.spring.cloud.service.controller;

import com.oshovskii.spring.cloud.service.entity.Product;
import com.oshovskii.spring.cloud.service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/api/v1/products")
    public List<Product> findAllProducts() {
        return productService.findAllProducts();
    }

}