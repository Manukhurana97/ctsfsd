package com.example.ecommerce_products.Dao;

import com.example.ecommerce_products.Model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerOrderDao extends JpaRepository<CustomerOrder, Integer> {
}
