package com.maven.mavenwithspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component is used to tell the program that this class is also a bean class and can be accessible with getBean("tyre")
@Component
public class Tyre {
	// to set the value of a variable of a Bean class we use @Value("value_of_variable")
//	@Value("ROSITO")
	private String brand;
	
	
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}
	//setter
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//getter
	public String getBrand() {
		return brand;
	}
	
	//write string
	@Override
	public String toString() {
//		return "Brand of tyre is => ".concat(brand);
		return "Tyre [ Brand = " + brand + "]";
	}
}
