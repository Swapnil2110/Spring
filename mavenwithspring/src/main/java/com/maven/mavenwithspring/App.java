package com.maven.mavenwithspring;

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
        System.out.println( "Starting program!" );
//        System.out.println(System.getProperty("user.dir"));
//        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/maven/mavenwithspring/spring.xml");

//        Vehicle obj = (Vehicle)context.getBean("car");
//        obj.drive();
		Tyre t = (Tyre) context.getBean("tyre");
		System.out.println(t);
    }
}
