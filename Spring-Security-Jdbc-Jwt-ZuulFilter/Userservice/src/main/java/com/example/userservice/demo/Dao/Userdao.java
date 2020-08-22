package com.example.userservice.demo.Dao;

import com.example.userservice.demo.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Component
@EnableTransactionManagement
public interface Userdao extends JpaRepository<Users, String> {
    public Users findByUsername(String username);
}
