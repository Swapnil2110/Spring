package com.maven.shapes_example;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shapes {

	public void area() {
		System.out.println("Area of circle = \u03C0 * r * r");
	}

	public void circumference() {
		// TODO Auto-generated method stub
		System.out.println("Circumference of circle = 2 * \u03C0 * r");
	}

}
