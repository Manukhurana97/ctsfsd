package com.springjdbc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springjdbc.model.Post;

@Repository("Pdaoimpl")
public class Postdaoimpl implements Postdao {

	SessionFactory sessionFactory;
	Session session;
	
	Postdaoimpl(){}
	
	@Autowired()
	public Postdaoimpl(SessionFactory factory)
	{
		super();
		this.sessionFactory=factory;
		session = sessionFactory.openSession();
	}
	
	
	
	@Override
	public Post createPost(Post post) {
		session.beginTransaction();
		session.save(post);
		session.getTransaction().commit();
		return post;
	}
}
