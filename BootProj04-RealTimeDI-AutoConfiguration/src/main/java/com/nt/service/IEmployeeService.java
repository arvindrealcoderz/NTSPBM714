package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface IEmployeeService {

	public List<EmployeeDTO> getEmployeeByDesg(String [] desg) throws Exception;
}
