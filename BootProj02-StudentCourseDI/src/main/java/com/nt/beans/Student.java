package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nt.course.Icourse;

@Component("student")
public class Student {
	
	@Autowired
//	@Qualifier("java")
	private Icourse course;
	public Student() {
		System.out.println("Student.Student(0 param constructor )");
	}

	public Student(Icourse course) {
		System.out.println("Student.Student(1 param constructor )");
		this.course = course;
	}
	
	
	public void examPrepration(String user) {
		System.out.println("Student.exam are prepration started ");
		System.out.println("Student.exam are started ");
		System.out.println("Mr. "+user+"your subject name is :: "+course.courseContent()+" and price of the subject is "+course.price());
		System.out.println("Student.exam prepration are ended ");
		
	}
	
	

}
