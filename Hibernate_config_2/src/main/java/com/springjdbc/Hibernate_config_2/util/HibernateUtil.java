package com.springjdbc.Hibernate_config_2.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.springjdbc.Hibernate_config_2.entity.Person;

public class HibernateUtil {
	
	static SessionFactory factory;
	
	static
	{
		factory = new Configuration().configure().addAnnotatedClass(Person.class).buildSessionFactory();
	}
	
	
	public HibernateUtil(){}
	
	public static Session getSession()
	{
		return factory.openSession();
	}

}
