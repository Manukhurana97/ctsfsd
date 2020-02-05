package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
@Transactional
public interface Dao extends JpaRepository<Customer, Integer> {

	public List<Customer> findByname(String name);
	
	public List<Customer> findByemail(String email);
	
	
}
