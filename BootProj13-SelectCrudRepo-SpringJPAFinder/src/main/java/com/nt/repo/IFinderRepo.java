package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.CoronaPatient;

@Repository("repo")
public interface IFinderRepo extends JpaRepository<CoronaPatient, Integer> {

	//public List<CoronaPatient> findByCompany(String company) ;
	//public List<CoronaPatient> findByCompanyEquals(String company) ;
	public List<CoronaPatient> findByCompanyIs(String company) ;
	public List<CoronaPatient> findByPrice(Double price) ;
	public List<CoronaPatient> findByPriceGreaterThan(Double price) ;
	public List<CoronaPatient> findBypriceLessThanEqual(Double price) ;
	public List<CoronaPatient> findByName(String name) ;
	
	
	public List<CoronaPatient> findByNameAndCompany(String name,String company) ;
	
	
}
