package com.springjdbc.Hiberbernate_onetoone_bidirectional;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Album;
import entity.Photo;
import entity.Songs;

public class Createalbum {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class).addAnnotatedClass(Photo.class).addAnnotatedClass(Songs.class).buildSessionFactory();
	
		Session session = factory.getCurrentSession();
		
		try {
			Album al = new Album("abcd", LocalDate.now());
			Songs sg =new Songs("manu12");
			Songs sg1 =new Songs("manu123");
			
			Photo ph = new Photo("https://www.youtube.com/watch?v=LjZi-S0xohg");
			al.add(sg);
			al.add(sg1);
			
			
			session.beginTransaction();
			
			System.out.println(al);
			
			session.save(al);
			session.save(sg);
			session.save(sg1);
			
			
			
			
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
