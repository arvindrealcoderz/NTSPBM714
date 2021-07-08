package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.CoronaVaccine;
import com.nt.service.ICoronaVaccineMgmtService;

@SpringBootApplication
public class BootProj09SpringDataJpaCoranaRegistrationApplication {

	public static void main(String[] args) {
		//get access
		ApplicationContext ctx= SpringApplication.run(BootProj09SpringDataJpaCoranaRegistrationApplication.class, args);
		ICoronaVaccineMgmtService service=ctx.getBean("vaccineMgmtService",ICoronaVaccineMgmtService.class);
		try {
			//create Entity class obj
			CoronaVaccine vaccine=new CoronaVaccine(1L,"covaxine","Bharat-BioTech","india",9360.3);
			System.out.println(service.registerVaccine(vaccine));
		}catch (Exception e) {e.printStackTrace();
		}
	
	
	
	}

}
