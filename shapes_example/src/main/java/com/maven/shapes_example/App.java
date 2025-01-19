package com.maven.shapes_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting point of a program for shapes" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/maven/shapes_example/spring.xml");
        Shapes obj = (Shapes)context.getBean("rectangle");
        obj.area();
        obj.circumference();
        
        System.out.println("================= Setter Injection ===========");
        Bottle btl = (Bottle) context.getBean("bottle");
        System.out.println(btl.getBrand());
        System.out.println(btl.getPrice());
        System.out.println(btl);
        
        System.out.println("================= Constructor Injection ================");
        Food food = (Food) context.getBean("food");
        System.out.println(food);
        
        System.out.println("================= AutoWired Annotation ==================");
        Car car = (Car)context.getBean("car");
        car.drive();
    }
}
