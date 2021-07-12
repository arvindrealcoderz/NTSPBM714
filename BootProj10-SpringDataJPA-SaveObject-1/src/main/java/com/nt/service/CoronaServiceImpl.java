package com.nt.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaVaccine;
import com.nt.repo.ICoronaVaccineRepo;

@Service("service")
public class CoronaServiceImpl implements ICoronaVaccineService{
@Autowired
	private ICoronaVaccineRepo repo;
	@Override
	public String reg(CoronaVaccine vacc) {
		CoronaVaccine va=repo.save(vacc);
		return va!=null?"Register suucess":"failue";
	}
	@Override
	public Iterable<CoronaVaccine> regAll(Iterable<CoronaVaccine> vacc) {
		Iterable<CoronaVaccine> va=repo.saveAll(vacc);
		return va;
	}
	

}
