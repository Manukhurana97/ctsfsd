package com.example.cucumberexample2.dao;

import com.example.cucumberexample2.model.entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Component
@EnableTransactionManagement
public interface Entitydao extends JpaRepository<entity, Integer> {
    public entity findById(int id);
}

