package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//@Entity
@Document
@Data
public class User {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name="Name")
	private String userName;
	@Column(name="Email")
	private String email;

}
