package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.beans.Employee;

public interface IEmployeeService {
	public List<Employee> findAll();
	public List<Employee> findById(Iterable<Integer> empno);
	public Optional<Employee> findByEmpID(Integer id);
	public List<Employee> findByempNo(Integer empNo);
	public List<Employee> findByEmployeeName(String name);

	public Employee findByEmpNoAndEmpName(String name, Integer empno );
	public Long countNoOfEmployee();
	public Iterable<Employee> findAllById(Iterable<Integer> empId);
	
	public Employee findBynameAndJob(String name , String job);
	public List<Employee> findByDeptOrEmpno(Integer deptno, Integer empNo);
	public List<Employee> findByDeptnoLessThanEqual (Integer deptno);

	public List<Employee> findByDeptnoGreaterThan(Integer deptno);
}
