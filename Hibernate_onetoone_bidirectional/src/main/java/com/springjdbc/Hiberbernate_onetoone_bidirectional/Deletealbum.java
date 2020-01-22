package com.springjdbc.Hiberbernate_onetoone_bidirectional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Album;
import entity.Photo;

public class Deletealbum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class).addAnnotatedClass(Photo.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter id");
		int id = Integer.parseInt(br.readLine());
		try 
		{
			session.beginTransaction();
			
			
			
			Album ab = session.get(Album.class, id);
			System.out.println(ab);
			
			if(ab!=null)
			{
				session.delete(ab);
			}
			
			
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
//		finally
//		{
//			session.close();
//		}
		
	}

}
