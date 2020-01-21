package com.springjdbc.Hibernate.model;

import java.time.LocalDate;
import java.util.Date;

import javax.xml.crypto.Data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter

public class Person {
	private String uid;
	private String name;
	private String email;
	private LocalDate data;
	
	@Override
	public String toString() {
		return "Person [uid=" + uid + ", name=" + name + ", email=" + email + ", date=" + data + "]";
	}
	
	

}
