package com.mycompany.Spring_project2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        coach ch = context.getBean("thecoach", Swimming.class);
        System.out.println(ch.getdailyworkout()+"\n"+ch.getdailyfortune());
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          