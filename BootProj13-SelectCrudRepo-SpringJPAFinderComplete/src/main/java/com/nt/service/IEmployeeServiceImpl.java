package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.beans.Employee;
import com.nt.repo.ICrudRepoFinder;

@Service("service")
public class IEmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private ICrudRepoFinder  repo;
	@Override
	public List<Employee> findAll() {
		return repo.findAll();
	}


	@Override
	public List<Employee> findById(Iterable<Integer> empno) {
		return repo.findAllById(empno);

	}


	@Override
	public Optional<Employee> findByEmpID(Integer id) {

		return repo.findById(id);
	}


	@Override
	public List<Employee> findByempNo(Integer empNo) {
		return repo.findByEmpNo(empNo);
	}


	@Override
	public List<Employee> findByEmployeeName(String name) {

		return repo.findByempName(name);
	}


	@Override
	public Employee findByEmpNoAndEmpName(String name, Integer empno) {

		return repo.findByEmpNoAndEmpName( empno,name);
	}


	@Override
	public Long countNoOfEmployee() {

		return repo.count();
	}


	@Override
	public Iterable<Employee> findAllById(Iterable<Integer> empId) {

		return repo.findAllById(empId);
	}


	@Override
	public Employee findBynameAndJob(String name, String job) {

		return repo.findByEmpNameAndEmpJob(name, job);
	}


	@Override
	public List<Employee> findByDeptOrEmpno(Integer deptno, Integer empNo) {
		
		return repo.findByDeptnoOrEmpNo(deptno, empNo);
	}

@Override
public List<Employee> findByDeptnoLessThanEqual(Integer deptno) {
	
	return repo.findByDeptnoLessThanEqual(deptno);
}

@Override
public List<Employee> findByDeptnoGreaterThan(Integer deptno) {
	// TODO Auto-generated method stub
	return repo.findByDeptnoGreaterThan(deptno);
}
}
