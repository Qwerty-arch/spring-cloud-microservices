package com.oshovskii.spring.cloud.service.repository;

import com.oshovskii.spring.cloud.service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}
