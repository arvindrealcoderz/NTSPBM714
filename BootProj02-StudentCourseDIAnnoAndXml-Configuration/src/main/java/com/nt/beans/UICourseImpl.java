package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("UI")
public class UICourseImpl implements ICourseDetails{

	@Override
	public String courseName() {
		System.out.println("UICourseImpl.courseName()");
		return "UI Technology";
	}

	@Override
	public Double coursefee() {
		System.out.println("UICourseImpl.coursefee()");
		return 30000.0;
	}

}
