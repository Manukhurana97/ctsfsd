package com.springjdbc.Spring_jdbc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.springjdbc.Spring_jdbc.dao.customerdao;
import com.springjdbc.Spring_jdbc.dao.customerdaoimpl;
import com.springjdbc.Spring_jdbc.model.Customer;


@Component
public class App 
{
	
	static List<Customer> lst;
	{
		lst = new ArrayList<Customer>();
	}
    public static void main( String[] args )
    {
    	try {
    		ApplicationContext appcntxt = new ClassPathXmlApplicationContext("applicationcontext.xml");
    		customerdao dao = appcntxt.getBean("dao", customerdao.class);
    		
    		
    		Customer c = dao.createCustomer("manu2", "manu@gmail.com");
    		System.out.println("inserted Successfully");
    		
    		lst = dao.displayall();
    		Iterator<Customer> itr = lst.iterator();
    		while(itr.hasNext())
    		{
    			System.out.println(itr.next());
    		}
    		
    		
    		
        	}
        	catch(Exception e)
        	{
        		e.printStackTrace();
        	}
    }
}
