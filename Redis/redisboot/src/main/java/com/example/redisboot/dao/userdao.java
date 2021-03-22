package com.example.redisboot.dao;

import com.example.redisboot.models.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userdao extends JpaRepository<user, Integer> {
    user findById(int id);
}
