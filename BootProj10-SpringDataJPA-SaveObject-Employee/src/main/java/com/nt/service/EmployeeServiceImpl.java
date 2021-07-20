package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.beans.Employee;
import com.nt.repo.IEmployeeRepo;
@Service("service")
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeRepo repo;
	@Override
	public Employee crudsave(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public List<Employee> crudsaveAll(Iterable<Employee> emp) {
		return (List<Employee>) repo.saveAll(emp);
	}
	@Override
	public List<Employee> jpasaveAll(Iterable<Employee> emp) {
		return repo.saveAll(emp);
	}
	@Override
	public Employee jpassaveAndFlush(Employee emp) {
		return repo.saveAndFlush(emp);
	}
	
	
	@Override
	public List<Employee> jpasaveAllAndFlush(Iterable<Employee> emp) {
		return repo.saveAllAndFlush(emp);
	}
}
