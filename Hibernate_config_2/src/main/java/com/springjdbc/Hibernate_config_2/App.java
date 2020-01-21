package com.springjdbc.Hibernate_config_2;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.springjdbc.Hibernate_config_2.entity.Person;
import com.springjdbc.Hibernate_config_2.service.serviceimpl;

public class App 
{
	public static serviceimpl impl;
	static List<Person> lst;
	
	static
	{
		impl = new serviceimpl();
		lst = new ArrayList<Person>();
	}
	
    public static void main( String[] args )
    {
        Person p = new Person();
        p.setUid(UUID.randomUUID().toString());
        p.setName("manu");
        p.setEmail("manu@gmail.com");
        impl.createperson(p);
        System.out.println(p);
        
        lst = impl.displayall();
        System.out.println(lst);
    }
}
