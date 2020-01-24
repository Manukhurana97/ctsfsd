package com.springjdbc.Spring_hibernate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.support.DaoSupport;

import com.springjdbc.dao.Postdao;
import com.springjdbc.dao.Postdaoimpl;
import com.springjdbc.model.Comments;
import com.springjdbc.model.Post;


public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	
    	
    	
       List<Comments> lst = new ArrayList<>();
       
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
     
       Postdaoimpl dao = context.getBean("Pdaoimpl", Postdaoimpl.class);
       
       
       Post Pst = new Post("mmanukhurana", "google.com", LocalDate.now());
       
       Comments c1 = new Comments("hello1", LocalDateTime.now());
       Comments c2 = new Comments("hello2", LocalDateTime.now());
       
       Pst.add(c1);
       Pst.add(c2);
       
       dao.createPost(Pst);
       
    }
}
