package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.beans.Student;

@SpringBootApplication
public class BootProj02StudentCourseDiApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx= SpringApplication.run(BootProj02StudentCourseDiApplication.class, args);
		//getting bean class object
		Student stud= ctx.getBean("student",Student.class);
		stud.examPrepration("Arvind ");
	}

}
