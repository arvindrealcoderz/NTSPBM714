package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.CoronaVaccine;
import com.nt.service.ICoronaVaccineMgmtService;
@Component("runner")
public class CrudRepoTestRunner implements CommandLineRunner {
	@Autowired
	private ICoronaVaccineMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		//invoke methods
		try {
			//create entity class object
			CoronaVaccine vaccine=new CoronaVaccine(102l, "covishield", "serum","india", 5200.0);
			System.out.println(service.registerVaccine(vaccine));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
