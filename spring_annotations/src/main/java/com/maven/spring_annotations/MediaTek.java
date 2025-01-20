package com.maven.spring_annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("meddiaTek") //@Component("Some text"), here some text will define that the id or name of this component.
//@Primary //@Primary defines that if there are more components which will provide the same class' object then which one to prioritized
public class MediaTek implements MobileProcessor {

	public void processor() {
		System.out.println("This is from processor method of MediaTek class implementing MobileProcessor Interface");
	}

}
