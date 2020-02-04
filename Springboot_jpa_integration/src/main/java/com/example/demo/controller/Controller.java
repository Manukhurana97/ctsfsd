package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.service;

@RestController
@RequestMapping("/api")
public class Controller {
	private service ss;

	public Controller(service ss) {
		super();
		this.ss = ss;
	}
	
	@GetMapping("/Customer")
	public List<Customer> getAllCustomers(){
		return ss.getAllCustomers();
		
	}
	

}
