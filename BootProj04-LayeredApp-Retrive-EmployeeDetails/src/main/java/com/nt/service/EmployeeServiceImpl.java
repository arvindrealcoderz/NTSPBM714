package com.nt.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;
//@Service("empService")
@Service()

public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	//@Qualifier("dao")
	private IEmployeeDAO dao;
	List<EmployeeDTO> listDto;
	@Override
	public List<EmployeeDTO> fetchEmployeeByDesg(String desg) {
			System.out.println("EmployeeServiceImpl.getEmployeeByDesg()");
		EmployeeDTO dto=null;
		 List<EmployeeBO> listbo= dao.getEmployeeByDesg(desg);
		//convert list bo to dto
		 
		//Collections.copy(listDto, listbo);
		for (int i = 0; i <listbo.size(); i++) {
			dto=new EmployeeDTO();
			dto.setEmpNo(listbo.get(i).getEmpNo());
			dto.setEName(listbo.get(i).getEName());
			dto.setJob(listbo.get(i).getJob());
			dto.setSal(listbo.get(i).getSal());
			listDto.add(dto);
		}
		return listDto;
	}
	

}
