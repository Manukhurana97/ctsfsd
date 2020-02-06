package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository("D")
public interface DAO extends CrudRepository<User, Integer> {

}
