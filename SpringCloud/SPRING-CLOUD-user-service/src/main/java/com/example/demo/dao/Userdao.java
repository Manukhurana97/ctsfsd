package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.User;


@Repository
@EnableTransactionManagement
//public interface Userdao extends JpaRepository<User, Integer> {
public interface Userdao extends MongoRepository<User, Integer> {

	
	public List<User> findByemail(String email);

	
	

}
