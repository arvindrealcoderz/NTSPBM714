package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.Employee;
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> ,CrudRepository<Employee, Integer> , PagingAndSortingRepository<Employee, Integer>{
	public List<Employee> findBy();
	public Employee findByEmpNo(Integer id);
	public Employee findByEnameAndJob(String ename , String job);
	public List<Employee> findByEnameOrEname(String fname,String ename);
	public Employee findByEnameIs(String ename);
	public List<Employee> findBySalBetween(Double startSal , Double endSal);
	public List<Employee> findBysalLessThan(Double sal);
	public List<Employee> findBySalLessThanEqual(Double sal);
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
	
	
}
