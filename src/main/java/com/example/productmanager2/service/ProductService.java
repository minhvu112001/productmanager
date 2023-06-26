package com.example.productmanager2.service;
import com.example.productmanager2.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product findById(int theId);
    public void save(Product theProduct);
    public void deleteById(int theId);
}
