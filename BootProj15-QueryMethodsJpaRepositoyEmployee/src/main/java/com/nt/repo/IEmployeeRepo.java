package com.nt.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

	//@Query("from Employee")
	//@Query("from com.nt.entity.Employee")
	//@Query("select u from com.nt.entity.Employee u")
	@Query("select u from com.nt.entity.Employee u")
	public List<Employee> findALl();
	@Query("select u from com.nt.entity.Employee u where deptno=:deptno")
	public List<Employee> findEmployeeDept(Integer deptno);
	@Query("select u from com.nt.entity.Employee u where deptno in (:deptno1,:deptno2,:deptno3) order by deptno desc")
	public List<Employee> findEmployeeBasedOnDept(Integer deptno1,Integer deptno2, Integer deptno3);
	@Query("select ename , job , sal , deptno from com.nt.entity.Employee where deptno in (:deptno1,:deptno2,:deptno3) order by deptno desc")
	public List<Object[]> findEmpBaseOnDeptno(Integer deptno1,Integer deptno2, Integer deptno3);
	@Query("select ename  from Employee where sal =:sal")
	public List<String> findEmpNameBaseOnSalary(Double sal);
	@Query("from Employee ")
	public Optional<Employee> findEmpSingleRow();
	@Query("select empno, ename ,job from Employee where ename=:name ")
	public Object findEmpByName(String name);
	@Query("select count(*) from Employee ")
	public long countNoOfEmployee();
	@Query("select count(*) from Employee where sal>:sal ")
	public long countNoOfEmployeeBasedOnSal(Double sal);
	@Query("select count(*) , min(sal) , max(sal) ,sum(sal) from Employee ")
	public Object aggregateFunction();

	//-----------------Update-----------------------------------
	
	@Modifying
	@Query("update Employee set sal=500-sal where sal<:sal")
	public int updateEmployeeSal(Double sal);
	@Modifying
	@Query(value =  "insert into Employee (empno , ename ,job ,sal) values (?,?,?,?) " , nativeQuery = true)
	public int insertRecored(Integer empno , String ename , String job , Double sal);
	
	
	
	

}
