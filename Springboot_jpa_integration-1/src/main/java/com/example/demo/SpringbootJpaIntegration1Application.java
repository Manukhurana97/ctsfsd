package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.Dao;
import com.example.demo.model.Customer;

@SpringBootApplication
public class SpringbootJpaIntegration1Application implements CommandLineRunner {
	
	public Dao D;
	
	
	@Autowired
	public SpringbootJpaIntegration1Application(Dao d) {
		super();
		D = d;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaIntegration1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		D.save(new Customer(1, "manu", "manu@123"));
		D.save(new Customer(2, "saif", "saif@123"));
		D.save(new Customer(3, "ArunC", "ArunC@123"));
		
	}

}
