package com.nt.service;

import com.nt.entity.CoronaVaccine;

public interface ICoronaVaccineMgmtService {
	public String registerVaccine(CoronaVaccine vaccine);
	public Iterable<CoronaVaccine> registerInBatch(Iterable<CoronaVaccine> vaccine);
	
}
