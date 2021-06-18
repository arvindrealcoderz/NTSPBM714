package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empservice")
public class EmployeeMgsServiceImpl implements IEmployeeService{

	@Autowired
	@Qualifier("empdao")
	private IEmployeeDAO dao;
	List<EmployeeDTO> listdto=new ArrayList();
	
	@Override
	public List<EmployeeDTO> fetchEmployeeByDesg(String[] desgs) throws Exception {
		//('clerk', 'manager')
		String data="";
		//'clerk' ,'MANAGER'
		for (int i = 0; i < desgs.length; i++) {
			if(i==0)
				data+="'"+desgs[i]+"'";
			else
				data+=",'"+desgs[i]+"'";
		}
		data="("+data+")";
		
		System.out.println("my data is :: "+data);
		//use dao
		EmployeeDTO empdto=null;
		List<EmployeeBO> listbo= dao.getEmployeeByDesg(data);
		//convert listbo to listdto
		
		for (int i = 0; i < listbo.size(); i++) {
			empdto=new EmployeeDTO();
			empdto.setEname(listbo.get(i).getEname());
			empdto.setEno(listbo.get(i).getEno());
			empdto.setJob(listbo.get(i).getJob());
			empdto.setSalary(listbo.get(i).getSalary());
			listdto.add(empdto);
			}
		return listdto;
	}
}
