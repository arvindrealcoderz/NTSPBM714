package com.nt.service;

import java.util.List;

import com.nt.beans.Employee;

public interface IEmployeeService {
	public Employee crudsave(Employee emp);
	public List<Employee> crudsaveAll(Iterable<Employee>  emp);
	public List<Employee> jpasaveAll(Iterable<Employee>  emp);
	public Employee jpassaveAndFlush(Employee  emp);
	public List<Employee> jpasaveAllAndFlush(Iterable<Employee>  emp);
	
}
