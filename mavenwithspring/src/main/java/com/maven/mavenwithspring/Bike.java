package com.maven.mavenwithspring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Bike is running");
	}

}
