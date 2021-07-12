	package com.nt.service;

import java.util.Iterator;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineService {
	public String reg(CoronaVaccine vacc);
	public Iterable<CoronaVaccine> regAll(Iterable<CoronaVaccine> vacc);
}
