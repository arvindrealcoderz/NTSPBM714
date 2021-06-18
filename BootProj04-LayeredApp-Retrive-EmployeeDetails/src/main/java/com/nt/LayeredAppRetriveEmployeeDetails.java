package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.vo.EmployeeVO;

@SpringBootApplication
public class LayeredAppRetriveEmployeeDetails {

	public static void main(String[] args) {
		//get IOC container 
		ApplicationContext ctx= SpringApplication.run(LayeredAppRetriveEmployeeDetails.class, args);
		//getBean id
		EmployeeController controller= ctx.getBean("employee",EmployeeController.class);
		List<EmployeeVO> listvo= controller.fetchEmployeeByDesg("MANAGER");
		System.out.println("EmpNo \t Ename\tJob\tSal");
		for (EmployeeVO vo : listvo) {
			System.out.println(vo.getEmpNo()+"\t"+vo.getEName()+"\t"+vo.getJob()+"\t"+vo.getSal());
		}
	}

}
