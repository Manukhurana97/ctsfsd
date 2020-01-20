package com.springjdbc.Spring_jdbc_template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.config.Customerconfig;
import com.springjdbc.model.Customer;

import com.springjdbc.service.CustomerService;
import com.springjdbc.service.CustomerServiceImpl;


public class App 
{
	
	
	
	public static void main( String[] args ) throws IOException, SQLException

    {
    
    	CustomerService service = null;
    	BufferedReader br=null;
    	AnnotationConfigApplicationContext   context = new AnnotationConfigApplicationContext(Customerconfig.class);
    	
    	try {
	    	br = new BufferedReader(new InputStreamReader(System.in));
	        
	        service=context.getBean("service",CustomerService.class);
	        
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
    	
    	finally {
    		context.close();
		}
    	
    	int choice=-1;
    	String uId,Name,email=null;
    	
    	do {
    		System.out.println("1. create customer.");
    		System.out.println("2. display all customer.");
    		System.out.println("3. display by id.");
    		System.out.println("4 delete by id");
    		choice=Integer.parseInt(br.readLine());
    		
    		switch(choice)
    		{
    		case 1:
    			System.out.println("Enter name");
    			Name = br.readLine();
    			System.out.println("Enter email");
    			email = br.readLine();
    			
    			uId = UUID.randomUUID().toString();
    			
    			service.insertdata(new Customer(Name, email, uId));
    			break;
    			
    		case 2:
    			List<Customer> l=service.getAllCustomers();
    			System.out.format("%-20s%-20s%-20s\n", "ID","Name","EMIL");
    			
    			l.forEach(c->{
					System.out.println(c);
				});
				break;
    			
    		case 3:
    			System.out.println("Enter id");
    			String id = br.readLine();
    			l = service.getCustomerById(id);
    			if(l.isEmpty())
    			{
    				System.out.println("no data found");
    				break;
    			}
    			else {
    				l.forEach(c->{
    					System.out.println(c);
    				});
    				break;
    			}
    			
    		case 4:
    			System.out.println("enter id");
    			String id1 = br.readLine();
    			int i = service.deletebyid(id1);
    			System.out.println(i);
    			
    		}
    				
    		
    	}
        while(choice!=0);
        
    }
}
