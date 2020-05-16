package com.example.springjwt.Dao;

import com.example.springjwt.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Userdao extends JpaRepository<Users, String> {
        public Users findByUsername(String username);
}
