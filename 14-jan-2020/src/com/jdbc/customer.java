package com.jdbc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class customer {
	private static final long serialVersionUID = 375065079056659899L;
	
	private int id;
	private String Name;
	private String email;
	
	public customer(String name, String email) {
		super();
		Name = name;
		this.email = email;
	}
	
	

}
