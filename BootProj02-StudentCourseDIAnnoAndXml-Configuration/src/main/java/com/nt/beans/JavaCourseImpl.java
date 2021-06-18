package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Java")
@Primary
public class JavaCourseImpl implements ICourseDetails{

	@Override
	public String courseName() {
		System.out.println("JavaCourseImpl.courseName()");
		return "Java";
	}

	@Override
	public Double coursefee() {
		System.out.println("JavaCourseImpl.coursefee()");
		return 10000.0;
	}

}
