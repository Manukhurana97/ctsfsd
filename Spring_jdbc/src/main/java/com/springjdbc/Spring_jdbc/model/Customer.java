package com.springjdbc.Spring_jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter

@ToString
public class Customer {
	
	private String name;
	private String email;
	
	public Customer(String name, String email) {
		super();
		
		this.name = name;
		this.email = email;
		
		
	}

	



	
	
	
	
	
	
	
	
}
