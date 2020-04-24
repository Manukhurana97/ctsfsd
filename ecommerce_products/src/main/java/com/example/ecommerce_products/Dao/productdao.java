package com.example.ecommerce_products.Dao;

import com.example.ecommerce_products.Model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productdao extends JpaRepository<Product, Integer> {
}
