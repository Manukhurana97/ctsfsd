package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.example.*")
public class SpringSecurityMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityMysqlApplication.class, args);
	}

}
