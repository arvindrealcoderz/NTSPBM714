package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.nt.service.IEmployeeService;

@Controller
public class EmployeeController implements CommandLineRunner{

	@Autowired
	private IEmployeeService service;
	@Override
	public void run(String... args) throws Exception {
		service.findAll().forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findById(List.of(7369,7499,30)).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findById(7499).ifPresent(System.out::println);
		System.out.println("--------------------------------------------");
		System.out.println(service.countNoOfEmployee());
		System.out.println("--------------------------------------------");
		System.out.println(service.existsById(10)?"Employee Recored are exist ":"Employee Not Exist");
		System.out.println("--------------Findet Methods ------------------------------");
		service.findByEmployees().forEach(System.out::println);
		System.out.println("--------------------------------------------");
		System.out.println( service.findByEmpNo(7499));
		System.out.println("--------------------------------------------");
		System.out.println( service.findByEnameAndJob("SMITH", "CLERK"));
		System.out.println("--------------------------------------------");
		service.findbyEnameOrEname("SMITH", "MARTIN").forEach(System.out::println);
		System.out.println("--------------------------------------------");
		System.out.println( service.findByEnameIs("SMITH"));
		System.out.println("--------------------------------------------");
		service.findBySalBetween(3000.0, 50000.0).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findBySalLessthan(1800.0).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findBySalLessthanEquals(960.05).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findBySalGreaterThan(2500.05).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findBySalGreaterThanEqual(3000.00).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findBySalBefore(3000.00).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findBySalIsNull().forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findBySalIsNotNull().forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findByEnameLike("SMITH").forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findByEnameNotLike("SMITH").forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findByEnameStartingWith("S").forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findByEnameStartsWith("S").forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findByEnameEndingWith("S").forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findByEnameEndsWith("S").forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findByEnameContains("S").forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findByEnameContaining("S").forEach(System.out::println);
		System.out.println("--------------------------------------------");
		service.findAllPaging("ename").forEach(System.out::println);;
		System.out.println("-------------------------ll-------------------");
		service.findAllPagingAndSal(4, 2, true, "ename");
		
		
		
		
	}
}
