package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeService;
import com.nt.vo.EmployeeVO;

@Controller("employee")
public class EmployeeController {

	@Autowired
	//@Qualifier("empService")
	private IEmployeeService service;
	private List<EmployeeVO> listvo=new ArrayList<EmployeeVO>();
	public List<EmployeeVO> fetchEmployeeByDesg(String desg){
		System.out.println("EmployeeController.fetchEmployeeByDesg()");
		List<EmployeeDTO> listdto=service.fetchEmployeeByDesg(desg);
		EmployeeVO vo=null;
		//convert listDto to vo object
		for (int i = 0; i < listdto.size(); i++) {
			vo=new EmployeeVO();
			vo.setEmpNo(String.valueOf(listdto.get(i).getEmpNo()));
			vo.setEName(listdto.get(i).getEName());
			vo.setJob(listdto.get(i).getJob());
			vo.setSal(String.valueOf(listdto.get(i).getSal()));
			listvo.add(vo);
		}
		return listvo;
	}
}
