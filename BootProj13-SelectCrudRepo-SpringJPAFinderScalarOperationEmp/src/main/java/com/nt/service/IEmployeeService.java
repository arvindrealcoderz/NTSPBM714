package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Sort;

import com.nt.entity.Employee;

public interface IEmployeeService {
	public List<Employee> findAll();
	public List<Employee> findById(Iterable<Integer> empId);
	public Optional<Employee> findById(Integer empId);
	public Long countNoOfEmployee();
	boolean existsById(Integer id);
	//==============Finder Methods ==================
	public List<Employee> findByEmployees();
	public Employee findByEmpNo(Integer id);
	public Employee findByEnameAndJob(String ename,String job);
	public List<Employee> findbyEnameOrEname(String fname ,String sname);
	public Employee findByEnameIs(String ename);
	public List<Employee> findBySalBetween(Double startSal , Double endSal);
	public List<Employee> findBySalLessthan(Double sal);
	public List<Employee> findBySalLessthanEquals(Double sal);
	public List<Employee> findBySalGreaterThan(Double sal);
	public List<Employee> findBySalGreaterThanEqual(Double sal);
	public List<Employee> findBySalBefore(Double sal);
	public List<Employee> findBySalIsNull();
	public List<Employee> findBySalIsNotNull();
	public List<Employee> findByEnameLike(String pattern);
	public List<Employee> findByEnameNotLike(String pattern);
	public List<Employee> findByEnameStartingWith(String pattern);
	public List<Employee> findByEnameStartsWith(String pattern);
	public List<Employee> findByEnameEndingWith(String pattern);
	public List<Employee> findByEnameEndsWith(String pattern);
	public List<Employee> findByEnameContains(String pattern);
	public List<Employee> findByEnameContaining(String pattern);
	
	//=============Paging and sorting ========================
	public List<Employee> findAllPaging(String ...strings);
	public List<Employee> findAllPagingAndSal(int pageNo, int pageSize , boolean asc, String ... props);
	
	
}
