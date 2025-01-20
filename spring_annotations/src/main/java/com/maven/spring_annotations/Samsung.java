package com.maven.spring_annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	@Autowired
	private MobileProcessor mp;
	
	public void config() {
		System.out.println("This is from config method of Samsung Class");
		mp.processor();
	}

}
