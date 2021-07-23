package com.nt.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeService;
@Component
@Transactional
public class EmployeeRinner implements CommandLineRunner {

	@Autowired
	private IEmployeeService service;
	@Override
	public void run(String... args) throws Exception {
		/*
		//service.findAllEmp().forEach(System.out::println);
		System.out.println("-------------------------------------------------");
		//service.findEmployeeDept(10).forEach(System.out::println);
		System.out.println("-------------------------------------------------");
		//service.findEmployeeBasedOnDept(10,20,30).forEach(System.out::println);
		System.out.println("-------------------------------------------------");
		//service.findEmpBaseOnDeptno(10,20,30).forEach(emp->System.out.println(emp[0]+"==="+emp[1]+"==="+emp[2]));
		System.out.println("-------------------------------------------------");
		//System.out.println(service.findEmpNameBaseOnSalary(2850.0));
		System.out.println("-------------------------------------------------");
		
		Optional<Employee> opt= service.findEmpSingleRow();
		if(opt.isPresent())
			System.out.println(opt.get().getClass());
		else
			System.out.println("Employee Does not exist");
		
		
		Object [] obj= (Object[]) service.findEmpByName("SMITH");	
		for (Object object : obj) {
			System.out.println(object);
		}
		
		
		
		//System.out.println(service.countNoOfEmployee());
		//System.out.println(service.countNoOfEmployeeBasedOnSal(2000.0));

		Object [] obj= (Object[]) service.aggregateFunction();
		System.out.println(obj[0]+" "+obj[1]+" "+obj[2]);
		*/
		//-----------------Update-----------------------------------
		//System.out.println(service.updateEmployeeSal(1500.0));
		System.out.println(service.insertRecored(9, "arvind", "IT", 522.0));
		
	}

}
