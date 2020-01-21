package com.springjdbc.Hibernate_config_2.service;

import java.util.List;

import com.springjdbc.Hibernate_config_2.dao.Personimpl;
import com.springjdbc.Hibernate_config_2.entity.Person;

public class serviceimpl {
	
	Personimpl dao;
	{
		dao = new Personimpl();
	}

	public Person createperson(Person person ) 
	{
		return dao.createpersion(person);
		
	}
	
	public List<Person> displayall()
	{
		return dao.displayall();
		
	}
	
}
