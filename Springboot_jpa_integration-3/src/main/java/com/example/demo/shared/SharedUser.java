package com.example.demo.shared;

public class SharedUser {
	
	private int uid;
	private String name;
	private String email;
	private String password;
	private String SSN;
	
	
	public SharedUser() {
		super();
	}


	public SharedUser(int uid, String name, String email, String password, String sSN) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
		SSN = sSN;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSSN() {
		return SSN;
	}


	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	
	
	
	
	

}
