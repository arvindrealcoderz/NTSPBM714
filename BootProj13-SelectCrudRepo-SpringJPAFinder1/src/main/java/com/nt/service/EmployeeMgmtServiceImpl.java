package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.beans.Employee;
import com.nt.repo.ICrudRepo;
@Component("service")
public class EmployeeMgmtServiceImpl implements ICrudRepoService {

	@Autowired
	private ICrudRepo repo;
	@Override
	public List<Employee> fetchEmpById(Integer empNo) {
		
		return repo.findByEmpNo(empNo);
	}
	@Override
	public List<Employee> fetchEmpByDeptno(Integer deptNo) {
		
		return repo.findByDeptno(deptNo);
	}

}
