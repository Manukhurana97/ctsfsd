package com.example.redis.Dao;

import com.example.redis.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    RedisTemplate<String, User> redisTemplate;

     HashOperations<String, String, User> hashOperations;

    public UserDaoImpl(RedisTemplate<String, User> redisTemplate) {
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public User save(User user) {
        hashOperations.put("UserData", user.id, user);
        return hashOperations.get("UserData", user.getId());
    }

    @Override
    public Map<String, User> findAll() {
        return hashOperations.entries("UserData");
    }

    @Override
    public User findById(String id) {
        return hashOperations.get("UserData", id);
    }

    @Override
    public void update(User user) {
        hashOperations.put("UserData", user.getId(), user);
    }

    @Override
    public void delete(String id) {
        hashOperations.delete("UserData", id);
    }
}
