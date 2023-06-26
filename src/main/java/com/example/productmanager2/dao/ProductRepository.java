package com.example.productmanager2.dao;
import com.example.productmanager2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public List<Product> findAllByOrderByProductNameAsc();
}