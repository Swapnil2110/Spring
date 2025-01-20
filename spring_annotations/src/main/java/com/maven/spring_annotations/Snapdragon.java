package com.maven.spring_annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements MobileProcessor {

	public void processor() {
		System.out.println("This is from processor method of Snapdragon class implementing MobileProcessor Interface");
	}

}
