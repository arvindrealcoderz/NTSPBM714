package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.nt.beans.Employee;
import com.nt.service.IEmployeeService;

@Controller
public class EmployeeController implements CommandLineRunner{

	@Autowired
	private IEmployeeService service;
	@Override
	public void run(String... args) throws Exception {
		Employee emp1=new Employee(8,"Priya Verma","MANAGER",200.0);
		Employee emp2=new Employee(7,"Ansu Verma","CLERK",36010.0);
		
		/*
		System.out.println("=======================");
		System.out.println(service.crudsave(emp1)!=null?"Employee recored save":"Employeerecored are not save");
		System.out.println("=======================");
		System.out.println(service.crudsaveAll(List.of(emp1, emp2))!=null?"Employee recored save":"Employeerecored are not save");
		System.out.println(service.jpasaveAll(List.of(emp1, emp2))!=null?"Employee recored save":"Employeerecored are not save");
	
		System.out.println("=======================");
		System.out.println(service.jpassaveAndFlush(emp1)!=null?"Employee recored save":"Employeerecored are not save");
			*/
		System.out.println("=======================");
		System.out.println(service.jpasaveAllAndFlush(List.of(emp1, emp2))!=null?"Employee recored save":"Employeerecored are not save");
		
		
	}

}
