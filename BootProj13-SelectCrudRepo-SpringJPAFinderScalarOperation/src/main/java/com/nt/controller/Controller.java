package com.nt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.Employee;
import com.nt.service.IEmployeeService;
import com.nt.type.ResultView;

@Configuration("controller")
public class Controller implements CommandLineRunner{

	@Autowired
	private IEmployeeService service;

	@Override
	public void run(String... args) throws Exception {
		service.findAllEmployee().forEach(System.out::println);
		List<ResultView> result= service.findAllEmployee();
		result.forEach(res->{
			System.out.println(res.getEmpName()+" "+res.getEmpName());
		});
		
	}
	
}
