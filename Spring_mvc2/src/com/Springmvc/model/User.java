package com.Springmvc.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
	
	private String userid;
	private String password;
	
	public User()
	{}
	
	public User(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	
	
	
}
