package com.maven.jdbc;

import java.util.Scanner;
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
    	Scanner sc = new Scanner(System.in);
    	int studentId = Integer.parseInt(sc.nextLine());
    	String studentName = sc.nextLine();
        ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfig.class);
        
        StudentDAO studentDao = context.getBean(StudentDAO.class);
        if(1== studentDao.addStudent(studentId, studentName)) {
        	System.out.println("student added successfully");
        } else {
        	System.out.println("Failed to add the student");
        }
        
    }
}
