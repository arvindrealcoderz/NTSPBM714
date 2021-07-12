package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.CrudRepository;

import com.nt.entity.CoronaVaccine;
import com.nt.runner.CrudRepoTestRunner;
import com.nt.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class BootProj09SpringDataJpaCoranaRegistrationApplication {

	public static void main(String[] args) {
		//get access
		 SpringApplication.run(BootProj09SpringDataJpaCoranaRegistrationApplication.class, args);
		
	}

}
