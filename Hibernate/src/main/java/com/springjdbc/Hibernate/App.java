package com.springjdbc.Hibernate;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;
import com.springjdbc.Hibernate.model.Person;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
        org.hibernate.SessionFactory sess= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session Ss = sess.openSession();
        
        Person p = new Person(UUID.randomUUID().toString(), "anu", ",anu@gmail.com", LocalDate.now());
        Ss.getTransaction().begin();
        Ss.save(p);
        Ss.getTransaction().commit();
        System.out.println("done");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
