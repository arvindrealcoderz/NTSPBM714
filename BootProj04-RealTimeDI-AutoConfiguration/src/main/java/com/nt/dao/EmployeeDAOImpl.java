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

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String GET_EMPS_BY_DESG="SELECT EMPNO , ENAME , JOB ,SAL , DEPTNO , MGR FROM EMP where JOB IN ";
	@Autowired
	private DataSource ds;
	
	
	@Override
	public List<EmployeeBO> getEmpsByDesg(String cond) throws Exception {
		 List<EmployeeBO> listBo=null;
		 EmployeeBO bo=null;
		try(	
				Connection con=ds.getConnection();
				Statement st=con.createStatement();//prepared statement object can not be user becouse of the no desg in dynamic input
				//send and execute query
				ResultSet rs=st.executeQuery(GET_EMPS_BY_DESG+cond+" order by job");
				
			){
				//convert rs recored object  to List of Bo class object
				listBo=new ArrayList<EmployeeBO>();
				while (rs.next()) {
					bo=new EmployeeBO();
					bo.setDeptNo(rs.getInt(5));
					bo.setEmpNo(rs.getInt(1));
					bo.setEname(rs.getString(2));
					bo.setJob(rs.getString(3));
					bo.setSal(rs.getDouble(4));
					bo.setMgNo(rs.getInt(6));
					listBo.add(bo);
				}
				
		}catch (Exception e) {
			e.printStackTrace();
		} 	
		return listBo;
	}

}
