package com.maven.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien alien = factory.getBean(Alien.class);
        alien.methodFromAlien();
    }
}
