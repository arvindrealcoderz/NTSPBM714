package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.beans.Employee;
import com.nt.type.ResultView;

public interface IEmployeeService {
	public List<ResultView> findAllEmployee();
	
	
}
