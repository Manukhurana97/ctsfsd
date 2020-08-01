package com.example.demo.Dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


import com.example.demo.Model.Users;

@Component
@Transactional
public interface Userdao extends JpaRepository<Users, String> {
    public Users findByUsername(String username);
}
