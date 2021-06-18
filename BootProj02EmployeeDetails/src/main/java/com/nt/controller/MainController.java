package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeService;
import com.nt.vo.EmployeeVo;
@Controller("controller")
public class MainController {
	
	@Autowired
	@Qualifier("empservice")
	private IEmployeeService service;
	private List<EmployeeVo> listbo=new ArrayList();
	public List<EmployeeVo> displayEmplyeeByDesg(String[] desgs) throws Exception{
		EmployeeVo vo=null;
		//use service
		List<EmployeeDTO> listdto=service.fetchEmployeeByDesg(desgs);
		
		//convert listdto to listvo
		for (int i = 0; i < listdto.size(); i++) {
			vo=new EmployeeVo();
			vo.setJob(listdto.get(i).getJob());
			vo.setEname(listdto.get(i).getEname());
			vo.setEno(Integer.toString(listdto.get(i).getEno()));
			vo.setSalary(Double.toString(listdto.get(i).getSalary()));
			listbo.add(vo);
		}
		
		return listbo;
		
		
	}
}
