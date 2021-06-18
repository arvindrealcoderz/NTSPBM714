package com.nt.course;

import org.springframework.stereotype.Component;

@Component("ui")
public class UITechnology implements Icourse {

	@Override
	public String courseContent() {
		System.out.println("UITechnology.courseContent()");
		return "UITechnology";
	}

	@Override
	public Double price() {
		System.out.println("UITechnology.price()");
		return 500.0;
	}

}
