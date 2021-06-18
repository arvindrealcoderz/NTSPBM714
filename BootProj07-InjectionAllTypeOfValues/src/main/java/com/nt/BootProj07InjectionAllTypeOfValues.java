package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.Employee;

@SpringBootApplication
public class BootProj07InjectionAllTypeOfValues {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx= SpringApplication.run(BootProj07InjectionAllTypeOfValues.class, args);
		Employee emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
	
	}

}
