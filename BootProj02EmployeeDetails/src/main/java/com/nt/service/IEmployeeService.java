package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface IEmployeeService {
	
	List<EmployeeDTO> fetchEmployeeByDesg(String[] desgs) throws Exception;

}
