package com.springjdbc.Spring_djbc_Config.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Component
public class Customer {
	private String uid;
	private String Name;
	private String email;
	@Override
	public String toString() {
		return "Customer [uid=" + uid + ", Name=" + Name + ", email=" + email + "]";
	}
	

	
}
