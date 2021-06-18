package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.Employee;

@SpringBootApplication
public class InjectionAllTypeOfValuesApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx= SpringApplication.run(InjectionAllTypeOfValuesApplication.class, args);
		Employee emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
	
	}

}
