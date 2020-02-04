package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.dao;
import com.example.demo.model.Customer;

@SpringBootApplication
public class SpringbootJpaIntegrationApplication implements CommandLineRunner {
	
	private dao d;
	
	
	@Autowired
	public SpringbootJpaIntegrationApplication(dao d) {
		super();
		this.d = d;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		d.save(new Customer(1, "123", "manu", "manu@gmail"));
		d.save(new Customer(2, "123", "manu", "manu@gmail"));
	}

}
