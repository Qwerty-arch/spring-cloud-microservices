package com.oshovskii.spring.cloud.service.service;

import com.oshovskii.spring.cloud.service.entity.Product;
import com.oshovskii.spring.cloud.service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

}
