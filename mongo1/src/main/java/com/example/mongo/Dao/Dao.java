package com.example.mongo.Dao;

import com.example.mongo.Model.Users;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Dao extends MongoRepository<Users, String> {
    Users findUsersByEmail(String email);

}
