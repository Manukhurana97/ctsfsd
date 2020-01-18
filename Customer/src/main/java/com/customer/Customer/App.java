package com.customer.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customer.Customer.bean.Customer;
import com.customer.Customer.bean.CustomerService;
import com.customer.Customer.bean.Customerseviceimpl;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        CustomerService cr = context.getBean("custservimp", Customerseviceimpl.class);
    	
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        
       do
       {
    	   System.out.println("enter 1 for insert data\n enter 0 to exit\n enter 2 to display all");
    	   choice = Integer.parseInt(br.readLine());
    	   switch(choice)
    	   {
    	   case 1:
    		   System.out.println("enter name");
    		   String cn = br.readLine();
    		   System.out.println("enter email");
    		   String ce = br.readLine();
    		   String id = UUID.randomUUID().toString();
    		   
    		   cr.insertCustomer(id, cn, ce);
    		   break;
    		   
    	   case 2:
    		   List<Customer> l = cr.displayall();
    		   Iterator<Customer> itr = l.iterator();
    		   while(itr.hasNext())
    		   {
    			   System.out.println(itr.next());
    		   }
    		   break;
    		   
    	   case 0:
    		   System.exit(0);
    		   break;
    	   }
    	   
       }
       while(true);
    	
        
        
    }
}
