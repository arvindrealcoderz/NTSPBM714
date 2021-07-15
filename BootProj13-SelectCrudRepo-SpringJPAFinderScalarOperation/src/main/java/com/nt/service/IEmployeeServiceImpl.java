package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.beans.Employee;
import com.nt.repo.ICrudRepoFinder;
import com.nt.type.ResultView;

@Service("service")
public class IEmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private ICrudRepoFinder repo;
	@Override
	public List<ResultView> findAllEmployee() {
		
		return repo.findBy();
	}
	
}
