package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nt.beans.Employee;
import com.nt.type.ResultView;

public interface ICrudRepoFinder extends JpaRepository<Employee, Integer>,CrudRepository<Employee, Integer>{
	
	public List<ResultView> findBy();
}
