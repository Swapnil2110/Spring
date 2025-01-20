package com.maven.spring_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "================== Start of the program ==================" );
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();
    }
}
