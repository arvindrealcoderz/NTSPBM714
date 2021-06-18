package com.nt.course;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dotNet")
@Primary
public class DotNet implements Icourse {

	@Override
	public String courseContent() {
		System.out.println("DotNet.courseContent()");
		return "DotNet";
	}

	@Override
	public Double price() {
		System.out.println("DotNet.price()");
		return 1000.0;
	}

}
