package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("DotNet")
public class DotNetCourseImpl implements ICourseDetails{

	@Override
	public String courseName() {
		System.out.println("DotNetCourseImpl.courseName()");
		return "DotNet";
	}

	@Override
	public Double coursefee() {
		System.out.println("DotNetCourseImpl.coursefee()");
		return 20000.0;
	}

}
