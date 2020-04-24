package com.example.ecommerce_products.Dao;

import com.example.ecommerce_products.Model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemDao extends JpaRepository<CartItem, Integer> {

}
