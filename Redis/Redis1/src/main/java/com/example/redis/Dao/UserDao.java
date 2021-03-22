package com.example.redis.Dao;

import com.example.redis.Models.User;

import java.util.Map;

public interface UserDao {

    User save(User user);
    Map<String, User> findAll();
    User findById(String id);
    void update(User user);
    void delete(String id);
}
