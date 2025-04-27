package com.sample;

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
        ApplicationContext context =new ClassPathXmlApplicationContext("SpringConfig.xml");
        System.out.println(context);
        Zoo z=(Zoo)context.getBean("z");
        System.out.println(z.getName());
        z.display();
        System.out.println( "Hello World!" );
    }
}
