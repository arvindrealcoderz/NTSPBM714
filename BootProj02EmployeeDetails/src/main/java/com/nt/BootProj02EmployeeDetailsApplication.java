package com.nt;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVo;

@SpringBootApplication
public class BootProj02EmployeeDetailsApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=	SpringApplication.run(BootProj02EmployeeDetailsApplication.class, args);
		//read input from scanner 
		//count and desg name of the array
		String[] desgs=null;
		
		//get controller class object
		MainController controller= ctx.getBean("controller", MainController.class);
		try {
			String[] str= {"CLERK", "MANAGER"};
		    List<EmployeeVo> vo=controller.displayEmplyeeByDesg(str);
		   // System.out.println("Employee Details Are :: \n========================");
		    System.out.println("EMPNO ENAME JOB SALARY ");
			for (EmployeeVo employeeVo : vo) {
				System.out.println(employeeVo.getEno()+" "+employeeVo.getEname()+" "+employeeVo.getJob()+" "+employeeVo.getSalary());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
