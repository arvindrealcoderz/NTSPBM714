package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.CoronaPatient;
import com.nt.repo.IFinderRepo;

@Service("service")
public class CoronaPatientServiceImpl implements IPatientService{

	@Autowired
	private IFinderRepo repo;
	@Override
	public List<CoronaPatient> findAllCompany(String company) {
		//return repo.findByCompany(company);
		//return repo.findByCompanyEquals(company);
		return repo.findByCompanyIs(company);
		
	}
	@Override
	public List<CoronaPatient> SortByPrice(Double price) {
		//return repo.findByPrice(price);
		return repo.findByPriceGreaterThan(price);
		//return repo.findByPriceGreaterThan(price);
		//return repo.findBypriceLessThanEqual(price);
		
	}
	@Override
	public List<CoronaPatient> sortingByName(String name) {
		
		return repo.findByName(name);
	}
	@Override
	public Iterable<CoronaPatient> SortByNameAndCompany(String name, String company) {
		
		return repo.findByNameAndCompany(name, company);
	}
}
