package com.springjdbc.Hibernate_config_2.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uid;
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;

	public Person(int id, String uid, String name, String email) {
		super();
		this.id = id;
		this.uid = uid;
		this.name = name;
		this.email = email;
	}
	
	
	
	
	
}
