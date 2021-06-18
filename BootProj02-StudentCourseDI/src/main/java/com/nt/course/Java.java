package com.nt.course;

import org.springframework.stereotype.Component;

@Component("java")
public class Java implements Icourse {

	@Override
	public String courseContent() {
		System.out.println("Java.courseContent()");
		return "Java";
	}

	@Override
	public Double price() {
		System.out.println("Java.price()");
		return 5000.0;
	}

}
