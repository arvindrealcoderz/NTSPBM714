package com.nt.service;

import java.util.List;

import com.nt.beans.Employee;

public interface ICrudRepoService {
	public List<Employee> fetchEmpById(Integer empNo);
	public List<Employee> fetchEmpByDeptno(Integer deptNo);
	

}
