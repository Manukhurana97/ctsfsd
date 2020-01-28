package servlet_hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import servlet_hibernate.model.Customer;

public class Customerutil {
	
	static SessionFactory factory = null;
	
	public static  SessionFactory getsessionobj()
	{
		return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
	}
	

}
