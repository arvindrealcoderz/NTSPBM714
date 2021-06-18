package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.Factory;

@SpringBootApplication
public class JavaConfigAnnoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(JavaConfigAnnoApplication.class, args);
		Factory factory= ctx.getBean("factory", Factory.class);
		System.out.println(factory.buyMoter("Arvind "));
	
	}

}
