package com.nt.service;

import com.nt.entity.CoronaPatient;

public interface IPatientService {
	public Iterable<CoronaPatient> findAllCompany(String company);
	public Iterable<CoronaPatient> sortingByName(String name);
	public Iterable<CoronaPatient> SortByPrice(Double price);
	public Iterable<CoronaPatient> SortByNameAndCompany(String name , String company);

}
