package com.maven.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	@Autowired
	Spaceship spaceship;
	public void methodFromAlien() {
		System.out.println("Method form Alien class");
		spaceship.ship1();
		spaceship.ship2();
	}
}
