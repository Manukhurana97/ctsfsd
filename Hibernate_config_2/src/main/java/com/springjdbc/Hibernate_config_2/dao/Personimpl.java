package com.springjdbc.Hibernate_config_2.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mysql.cj.Query;
import com.springjdbc.Hibernate_config_2.entity.Person;
import com.springjdbc.Hibernate_config_2.util.HibernateUtil;


public class Personimpl {
	
	Session sess;
	Transaction trans = sess.getTransaction();
	BufferedReader br;
	Person p;
	
	{
		sess = HibernateUtil.getSession();
		
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public Person createpersion(Person person ) 
	{
		try 
		{
			trans.begin();
			sess.save(person);
			trans.commit();
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return person;
	}
	
	
	public List<Person> displayall()
	{
		org.hibernate.Query q = sess.createQuery("from Person");
		return q.list();
	}
	
	public Person getPersonByid(String uid) 
	{
		Person p = sess.get(Person.class, uid);
		if(p==null)
		{
			System.out.println("not found");
		}
		return p;
	}
	
	
	public Person updatebyid(String uid) throws IOException
	{
		Person person= sess.get(Person.class, uid);
		{
			if(person==null)
			{
				System.out.println("no data found");
			}
			else 
			{
				System.out.println("enter Name");
				String name = br.readLine();
				
				person.setName(name);
				System.out.println("enter email");
				String email = br.readLine();
				person.setEmail(email);
				
				trans.begin();
				sess.save(person);
				trans.commit();
				

			}
		}
		
		return person;
		
	}
	

}
