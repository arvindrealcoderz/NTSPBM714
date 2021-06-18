package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	@Qualifier("courseId")
	private ICourseDetails course;
	
	public String coursePrepration(String user) {
		return "Mr. "+user+"Your subject course name is "+course.courseName()+" and fee are "+course.coursefee();
	}
}
