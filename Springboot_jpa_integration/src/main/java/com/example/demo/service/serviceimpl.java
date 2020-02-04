package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.dao.dao;
import com.example.demo.model.Customer;

@Service
@EnableTransactionManagement
public class serviceimpl implements service{
	private dao d;

	public serviceimpl(dao d) {
		super();
		this.d = d;
	}

	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		
		return d.findAll();
	}
	
	
	
	
}
