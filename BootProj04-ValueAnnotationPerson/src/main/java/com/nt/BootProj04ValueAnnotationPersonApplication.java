package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.PersonBean;

@SpringBootApplication
public class BootProj04ValueAnnotationPersonApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj04ValueAnnotationPersonApplication.class, args);
		PersonBean bean=ctx.getBean("person",PersonBean.class);
		System.out.println(bean);
		
	
	}

}
