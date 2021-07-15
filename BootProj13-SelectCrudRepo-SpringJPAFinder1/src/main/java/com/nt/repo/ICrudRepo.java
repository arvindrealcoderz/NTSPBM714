package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.beans.Employee;
@Repository("dao")
public interface ICrudRepo extends JpaRepository<Employee, Integer> {

	public List<Employee> findByEmpNo(Integer empNo);
	public List<Employee> findByDeptno(Integer deptno); 
	
	
}
