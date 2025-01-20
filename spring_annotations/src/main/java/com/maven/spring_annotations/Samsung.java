package com.maven.spring_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	@Autowired
	@Qualifier("meddiaTek") // In run time it tells which object needs to be used, here in this case it prioritized the Bean class with name (id) meddiaTek
	private MobileProcessor mp;
	
	public void config() {
		System.out.println("This is from config method of Samsung Class ");
		mp.processor();
	}

}
