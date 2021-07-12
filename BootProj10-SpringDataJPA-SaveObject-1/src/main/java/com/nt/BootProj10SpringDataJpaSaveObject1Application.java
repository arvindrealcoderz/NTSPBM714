package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.CoronaVaccine;
import com.nt.service.ICoronaVaccineService;

@SpringBootApplication
public class BootProj10SpringDataJpaSaveObject1Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj10SpringDataJpaSaveObject1Application.class, args);
		ICoronaVaccineService service= ctx.getBean("service",ICoronaVaccineService.class);
		//System.out.println( service.reg(new CoronaVaccine(101,"Arins")));
	
		Iterable<CoronaVaccine> vacc=service.regAll(List.of(
				new CoronaVaccine(10, "Raja"),
				new CoronaVaccine(20, "Rani")
				));
		System.out.println("Register Number ");
		vacc.forEach(reg->System.out.println(reg.getRegNo()));
	
	}

}
