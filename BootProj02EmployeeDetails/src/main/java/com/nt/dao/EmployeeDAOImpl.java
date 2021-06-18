package com.nt.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empdao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPS_BY_DEPT="select empno ,ename , job , sal from emp where job in ";
	@Autowired
	private DataSource ds;
	
	@Override
	public List<EmployeeBO> getEmployeeByDesg(String desg) throws Exception {
		EmployeeBO bo=null;
		List<EmployeeBO> listbo=null;
		
		try(
				Connection con=ds.getConnection();
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(GET_EMPS_BY_DEPT+desg);
				
			){
			listbo=new ArrayList<EmployeeBO>();
			while (rs.next()) {
				bo=new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSalary(rs.getDouble(4));
				listbo.add(bo);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return listbo;
	}

}
