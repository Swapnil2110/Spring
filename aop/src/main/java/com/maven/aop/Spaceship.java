package com.maven.aop;

import org.springframework.stereotype.Component;

@Component
public class Spaceship {
	public void ship1() {
		System.out.println("This is Spaceship One (1)");
	}
	public void ship2() {
		System.out.println("This is Spaceship Two (2)");
	}
}
