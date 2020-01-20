package com.springjdbc.Spring_djbc_Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.Spring_djbc_Config.config.Customerconfig;
import com.springjdbc.Spring_djbc_Config.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Customerconfig.class);
       Customer c = context.getBean("customer", Customer.class);
       c.setUid("abc213");
       c.setName("manu123");
       c.setEmail("manu123@gmail.com");
       
       System.out.println(c);
    }
}
