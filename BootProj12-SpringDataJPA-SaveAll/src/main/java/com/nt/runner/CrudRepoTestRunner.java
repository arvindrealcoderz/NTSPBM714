package com.nt.runner;

import java.util.List;


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

			Iterable<CoronaVaccine> listvaccine=service.registerInBatch(
					List.of(
							new CoronaVaccine(1l,"covisheld", "Indai","India",25000.0),
							new CoronaVaccine(2l,"sputnik", "Russia","russia",35000.0)

							)

					);
			System.out.println("==============================");
			System.out.println(service.registerInBatch(listvaccine));
			System.out.println("the regNo are");
			listvaccine.forEach(vaccine1->System.out.println(vaccine.getRegNo()));
			System.out.println("==============================");

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
