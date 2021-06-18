package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository()
//@Repository("dao")
public class EmplyeeDAOImpl implements IEmployeeDAO {
	private static final String Get_Emp_By_Desg="select empno , ename , job, sal from emp where job=?"; 
	@Autowired
	private DataSource ds;
	
	@Override
	public List<EmployeeBO> getEmployeeByDesg(String desg) {
		List<EmployeeBO> listbo=new ArrayList<EmployeeBO>();
		EmployeeBO bo=null;
		System.out.println("EmplyeeDAOImpl.getEmployeeByDesg()");
		try {
			Connection con=ds.getConnection();
			PreparedStatement pst=con.prepareStatement(Get_Emp_By_Desg);
			if(pst!=null)
				pst.setString(1, desg);
			ResultSet rs= pst.executeQuery();
			while (rs.next()) {
				bo=new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEName(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getDouble(4));
				//add bo object to list
				listbo.add(bo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("connection failed");
		}
		return listbo;
	}

}
