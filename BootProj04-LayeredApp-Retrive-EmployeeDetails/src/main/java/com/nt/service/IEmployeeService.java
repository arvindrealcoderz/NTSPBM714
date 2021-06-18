package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface IEmployeeService {
	
	public List<EmployeeDTO> fetchEmployeeByDesg(String user);

}
