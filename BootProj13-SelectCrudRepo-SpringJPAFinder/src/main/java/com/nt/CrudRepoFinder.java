package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.CoronaPatient;
import com.nt.service.IPatientService;

@SpringBootApplication
public class CrudRepoFinder {

	public static void main(String[] args) {
		ApplicationContext  ctx= SpringApplication.run(CrudRepoFinder.class, args);
		IPatientService service=ctx.getBean("service",IPatientService.class);
		service.findAllCompany("India").forEach(System.out::println);;	
		System.out.println("==========================================");
		service.findAllCompany("India").forEach(System.out::println);	
		System.out.println("==========================================");
		service.SortByPrice(5000.0).forEach(System.out::println);	
		System.out.println("==========================================");
		service.sortingByName("Raja").forEach(System.out::println);	
		
		System.out.println("========Name and Company==================================");
		service.SortByNameAndCompany("Raja","India").forEach(System.out::println);	
		
		
	}

}
