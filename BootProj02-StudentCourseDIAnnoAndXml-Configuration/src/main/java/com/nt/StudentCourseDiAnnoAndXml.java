package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.beans.Student;

@SpringBootApplication
@ImportResource("com/nt/commons/applicationContext.xml")
public class StudentCourseDiAnnoAndXml {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx= SpringApplication.run(StudentCourseDiAnnoAndXml.class, args);
		//getBean Id 
		Student stud= ctx.getBean("student",Student.class);
		System.out.println(stud.coursePrepration("Arvind Verma "));
	
	
	}

}
