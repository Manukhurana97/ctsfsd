package com.springjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Customer {
	private String uid;
	private String Name;
	private String email;
	@Override
	public String toString() {
		return "Customer [uid=" + uid + ", Name=" + Name + ", email=" + email + "]";
	}
	
	
	
}
