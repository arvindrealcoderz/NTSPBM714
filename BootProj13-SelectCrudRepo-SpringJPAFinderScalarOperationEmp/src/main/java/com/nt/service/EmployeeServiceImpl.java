package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repo.IEmployeeRepo;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;
	@Override
	public List<Employee> findAll() {

		return repo.findAll();

	}
	@Override
	public List<Employee> findById(Iterable<Integer> empId) {
		return repo.findAllById(empId);
	}
	@Override
	public Optional<Employee> findById(Integer empId) {

		return repo.findById(7499);
	}
	@Override
	public Long countNoOfEmployee() {
		return repo.count();
	}
	@Override
	public boolean existsById(Integer id) {
		return repo.existsById(id);
	}
	//===============Finder Methods===========================
	@Override
	public List<Employee> findByEmployees() {
		return repo.findBy();
	}
	@Override
	public Employee findByEmpNo(Integer id) {

		return repo.findByEmpNo(id);
		//return null;
	}
	@Override
	public Employee findByEnameAndJob(String ename, String job) {
		return repo.findByEnameAndJob(ename, job);
	}
	@Override
	public List<Employee> findbyEnameOrEname(String fname, String sname) {
		return repo.findByEnameOrEname(fname, sname);
	}

	@Override
	public Employee findByEnameIs(String ename) {
		return repo.findByEnameIs(ename);
	}
	@Override
	public List<Employee> findBySalBetween(Double startSal, Double endSal) {
		return repo.findBySalBetween(startSal, endSal);
	}
	@Override
	public List<Employee> findBySalLessthan(Double sal) {
		return repo.findBysalLessThan(sal);
	}
	@Override
	public List<Employee> findBySalLessthanEquals(Double sal) {
		return repo.findBySalLessThanEqual(sal);
	}

	@Override
	public List<Employee> findBySalGreaterThan(Double sal) {
		return repo.findBySalGreaterThan(sal);
	}

	@Override
	public List<Employee> findBySalGreaterThanEqual(Double sal) {
		return repo.findBySalGreaterThanEqual(sal);
	}

	@Override
	public List<Employee> findBySalBefore(Double sal) {
		return repo.findBySalBefore(sal);
	}

	@Override
	public List<Employee> findBySalIsNull() {
		return repo.findBySalIsNull();
	}

	@Override
	public List<Employee> findBySalIsNotNull() {

		return repo.findBySalIsNotNull();
	}

	@Override
	public List<Employee> findByEnameLike(String pattern) {
		return repo.findByEnameLike(pattern);
	}

	@Override
	public List<Employee> findByEnameNotLike(String pattern) {
		return repo.findByEnameNotLike(pattern);
	}

	@Override
	public List<Employee> findByEnameStartingWith(String pattern) {

		return repo.findByEnameStartingWith(pattern);
	}
	@Override
	public List<Employee> findByEnameStartsWith(String pattern) {

		return repo.findByEnameStartsWith(pattern);
	}

	@Override
	public List<Employee> findByEnameEndingWith(String pattern) {
		return repo.findByEnameEndsWith(pattern);
	}
	@Override
	public List<Employee> findByEnameEndsWith(String pattern) {
		return repo.findByEnameEndingWith(pattern);
	}
	@Override
	public List<Employee> findByEnameContains(String pattern) {
		return repo.findByEnameContains(pattern);
	}
	@Override
	public List<Employee> findByEnameContaining(String pattern) {
		return repo.findByEnameContaining(pattern);
	}
	
	@Override
	public List<Employee> findAllPaging(String... strings) {
		Sort sort=Sort.by(Direction.ASC,strings );
		
		return repo.findAll(sort);
	}
	
	
	
	@Override
	public List<Employee> findAllPagingAndSal(int pageNo, int pageSize, boolean asc, String ... props) {
		Pageable pageable=PageRequest.of(pageNo,pageSize ,asc?Direction.ASC:Direction.DESC,"ename");
		return null;
	}
}
