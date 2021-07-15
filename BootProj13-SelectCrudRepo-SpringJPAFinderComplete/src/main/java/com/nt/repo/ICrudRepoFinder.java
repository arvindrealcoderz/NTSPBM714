package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nt.beans.Employee;

public interface ICrudRepoFinder extends JpaRepository<Employee, Integer>,CrudRepository<Employee, Integer>{
	
	public List<Employee> findByEmpNo(Integer empNo);
	public List<Employee> findByempName(String name);
	public Employee findByEmpNoAndEmpName( Integer empno ,String name);
	public Employee findByEmpNameAndEmpJob(String name , String job);
	public List<Employee> findByDeptnoOrEmpNo(Integer deptno, Integer empno);
	public List<Employee> findByDeptnoLessThanEqual (Integer deptno);
	public List<Employee> findByDeptnoGreaterThan(Integer deptno);
	
}
