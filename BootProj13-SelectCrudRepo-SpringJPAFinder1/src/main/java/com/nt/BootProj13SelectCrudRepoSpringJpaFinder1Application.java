package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.service.ICrudRepoService;


@SpringBootApplication
public class BootProj13SelectCrudRepoSpringJpaFinder1Application {
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj13SelectCrudRepoSpringJpaFinder1Application.class, args);
		ICrudRepoService service= ctx.getBean("service",ICrudRepoService.class);
		service.fetchEmpById(7499).forEach(System.out::println);;
		service.fetchEmpByDeptno(10).forEach(System.out::println);
		
	
	}

}
