package com.springjdbc.Hiberbernate_onetoone_bidirectional;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Album;
import entity.Photo;

public class getalldata {
	
	public static void main(String[] args) {
		
		List<Album> lst = new ArrayList<Album>();
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class).addAnnotatedClass(Photo.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			session.getTransaction().begin();
			Query qu = session.createQuery("from Album");
			System.out.println(qu.list());
			
			
			
			
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
