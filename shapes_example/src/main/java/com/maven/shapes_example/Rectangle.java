package com.maven.shapes_example;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shapes {

	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle = l * b");

	}

	// rectangle do not have circumference but considering parameter as circumference
	public void circumference() {
		// TODO Auto-generated method stub
		System.out.println("Parameter of rectangle = 2(l+b)");
	}

}
