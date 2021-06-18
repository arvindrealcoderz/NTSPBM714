package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;
import com.nt.vo.EmployeeVo;

public interface IEmployeeDAO {
	public List<EmployeeBO> getEmployeeByDesg(String desg) throws Exception;

}
