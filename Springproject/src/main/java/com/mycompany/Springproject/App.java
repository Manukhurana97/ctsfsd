package com.mycompany.Springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.Springproject.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
       try {
    	   ApplicationContext appcntxt = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	  Employee ee = appcntxt.getBean("employee", Employee.class);
    	  System.out.println(ee);
    	 
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
    }
}
