package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Employee;

public interface IEmployeeService {

	public List<Employee> findAllEmp();
	public List<Employee> findEmployeeDept(Integer deptno);
	public List<Employee> findEmployeeBasedOnDept(Integer deptno1,Integer deptno2, Integer deptno3);
	public List<Object[]> findEmpBaseOnDeptno(Integer deptno1,Integer deptno2, Integer deptno3);
	public List<String> findEmpNameBaseOnSalary(Double sal);
	public Optional<Employee> findEmpSingleRow();
	public Object findEmpByName(String name);
	public long countNoOfEmployee();
	public long countNoOfEmployeeBasedOnSal(Double sal);
	public Object aggregateFunction();

	//-----------------Update-----------------------------------
	public int updateEmployeeSal(Double sal);
	public int insertRecored(Integer empno , String ename , String job , Double sal);
	
}
