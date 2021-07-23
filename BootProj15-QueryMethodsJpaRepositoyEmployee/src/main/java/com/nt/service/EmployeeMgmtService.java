package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repo.IEmployeeRepo;

@Service("service")
public class EmployeeMgmtService  implements IEmployeeService{

	@Autowired
	private IEmployeeRepo repo;
	@Override
	public List<Employee> findAllEmp() {

		return repo.findALl();
	}

	@Override
	public List<Employee> findEmployeeDept(Integer deptno) {

		return repo.findEmployeeDept(deptno);
	}
	
	@Override
	public List<Employee> findEmployeeBasedOnDept(Integer deptno1, Integer deptno2, Integer deptno3) {
	
		return repo.findEmployeeBasedOnDept(deptno1, deptno2, deptno3)
				;
	}
	
	@Override
	public List<Object[]> findEmpBaseOnDeptno(Integer deptno1, Integer deptno2, Integer deptno3) {
		// TODO Auto-generated method stub
		return repo.findEmpBaseOnDeptno(deptno1, deptno2, deptno3);
	}
	
	@Override
	public List<String> findEmpNameBaseOnSalary(Double sal) {
		return repo.findEmpNameBaseOnSalary(sal);
	}
	@Override
	public Optional<Employee> findEmpSingleRow() {
		
		return repo.findEmpSingleRow();
	}
	@Override
	public Object findEmpByName(String name) {
		
		return repo.findEmpByName(name);
	}
	
	@Override
	public long countNoOfEmployee() {
		
		return repo.countNoOfEmployee();
	}
	@Override
	public long countNoOfEmployeeBasedOnSal(Double sal) {
		return repo.countNoOfEmployeeBasedOnSal(sal);
	}
	@Override
	public Object aggregateFunction() {
		return repo.aggregateFunction();
	}

	//-----------------Update-----------------------------------
	
	@Override
	public int updateEmployeeSal(Double sal) {
		return repo.updateEmployeeSal(sal);
	}
	
	@Override
	public int insertRecored(Integer empno, String ename, String job, Double sal) {
			return repo.insertRecored(empno, ename, job, sal);
	}
	
	
	
	
	
}
