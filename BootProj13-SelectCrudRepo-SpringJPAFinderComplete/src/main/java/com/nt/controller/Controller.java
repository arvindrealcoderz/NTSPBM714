package com.nt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.Employee;
import com.nt.service.IEmployeeService;

@Configuration("controller")
public class Controller implements CommandLineRunner{

	@Autowired
	private IEmployeeService service;

	@Override
	public void run(String... args) throws Exception {
		/*
		System.out.println("==========find All Employee Details  ===================");
		service.findAll().forEach(System.out::println);
		System.out.println("==========find All Employee Details By ID===================");
		service.findById(List.of(7876,7654,7566)).forEach(System.out::println);
		System.out.println("==========find All Employee Details By empId===================");
		System.out.println( service.findByEmpID(7876));
		System.out.println("==========find All Employee Details By empId===================");
		Optional<Employee> opt= service.findByEmpID(7901);
		if(!opt.isEmpty())
			System.out.println("Employee Recored Exist "+opt.toString());
		else
			System.out.println("Employee Recored not Exist "+opt);
		System.out.println("===============================================================");
		
		service.findByEmployeeName("ADAMS").forEach(System.out::println);
		System.out.println("===============================================================");
		Employee isEmployee= service.findByEmpNoAndEmpName("ADAMS",7176);
		if(isEmployee!=null) {
			System.out.println("Employee Are :: "+isEmployee.toString());
		}else
			System.out.println("Employee not exist  :: ");
		System.out.println("===============================================================");
		System.out.println("No fo employee "+service.countNoOfEmployee()); 
		

		System.out.println("===============================================================");
		System.out.println("No fo employee "+service.countNoOfEmployee()); 
		System.out.println("===============================================================");
		service.findAllById(List.of(7876,7654,7566)).forEach(System.out::println);
		System.out.println("===============================================================");
		
		Employee fnaj= service.findBynameAndJob("ADAMS","CLERK");
		if(isEmployee!=null) {
			System.out.println("Employee Are :: "+fnaj.toString());
		}else
			System.out.println("Employee not exist  :: ");
		System.out.println("===============================================================");
		service.findByDeptOrEmpno(10, 1111).forEach(System.out::println);
		
		System.out.println("===============================================================");
		service.findByDeptnoLessThanEqual(20).forEach(System.out::println);
		*/
		
		System.out.println("===============================================================");
		service.findByDeptnoGreaterThan(20).forEach(System.out::println);
		 
		 
		
		
		
		
		 
	}
	
}
