package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaVaccine;
import com.nt.repo.ICoronaVaccineRepo;
@Service("vaccineMgmtService")
public class CoronaVaccineMfmtService implements ICoronaVaccineMgmtService {

	@Autowired
	private ICoronaVaccineRepo coronaRepo;
	@Override
	public String registerVaccine(CoronaVaccine vaccine) {
		System.out.println("In memory proxy classs"+coronaRepo.getClass());
		CoronaVaccine saveVaccine=null;
		if(vaccine!=null)
			saveVaccine=coronaRepo.save(vaccine);
		return saveVaccine!=null?"Vacine registration success":"Vaccine registration failure";
	}

}
