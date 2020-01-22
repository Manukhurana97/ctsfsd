package com.springjdbc.Hiberbernate_onetoone_bidirectional;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Album;
import entity.Photo;

public class Createalbum {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class).addAnnotatedClass(Photo.class).buildSessionFactory();
	
		Session session = factory.getCurrentSession();
		
		try {
			Album al = new Album("abc", LocalDate.now());
			Photo ph = new Photo("https://www.youtube.com/watch?v=LjZi-S0xohg");
			al.setPhoto(ph);
			
			session.beginTransaction();
			
			System.out.println(al);
			
			session.save(al);
			
			session.getTransaction().commit();
			
			System.out.println("done");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally {
			factory.close();
		}
		
	}

}
