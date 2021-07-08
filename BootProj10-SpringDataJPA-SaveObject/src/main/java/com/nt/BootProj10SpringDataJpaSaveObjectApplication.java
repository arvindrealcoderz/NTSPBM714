package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Student;
import com.nt.service.StudentMgmtService;

@SpringBootApplication
public class BootProj10SpringDataJpaSaveObjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj10SpringDataJpaSaveObjectApplication.class, args);
		StudentMgmtService service= ctx.getBean("studservice", StudentMgmtService.class);
		System.out.println("=========="+service.save(new Student(101, "Arvind", "Java",55.0)));
	}

}
