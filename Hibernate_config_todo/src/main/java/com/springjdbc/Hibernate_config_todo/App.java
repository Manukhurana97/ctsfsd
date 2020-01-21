package com.springjdbc.Hibernate_config_todo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;

import com.springjdbc.Hibernate_config_todo.entity.todo;

public class App 
{
    public static void main( String[] args )
    {
        Session sess = null;
        org.hibernate.SessionFactory sessfac = null;
        
        try {
        	sessfac = new Configuration().configure().addAnnotatedClass(todo.class).buildSessionFactory();// used mapping specified the hibernate file
        	sess = sessfac.openSession();
        	todo td = new todo();
        	td.setUid(UUID.randomUUID().toString());
        	td.setDate(LocalDateTime.now());
        	td.setName("manu");
        	sess.getTransaction().begin();
        	sess.save(td);
        	sess.getTransaction().commit();
        	
        	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
        	sess.close();
        	sessfac.close();
        	
        }
    }
}
