package com.maven.shapes_example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Bean class for Bottle 
//@Component
public class Bottle {

	private String brand;
	private int price;
	
	// constructor to set the values
	public Bottle(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public Bottle() {}

	//setter for brand
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//setter for price
	public void setPrice(int price) {
		this.price = price;
	}
	
	//getter for brand
	public String getBrand() {
		return "Brand is " + brand;
	}
	
	//getter for price
	public String getPrice() {
		return "Price is " + price;
	}
	
	//toString to print the obj
	@Override
	public String toString() {
		return "Brand is " + brand + " Price is " + price;
	}
}
