package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Student;
import com.nt.service.IStudentService;

@SpringBootApplication
public class BootProj13SelectCrudRepoSpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj13SelectCrudRepoSpringJpaApplication.class, args);
		IStudentService service= ctx.getBean("studentservice",IStudentService.class);
		Student student=new Student();
		student.setSid(1);
		student.setName("Arvind");
		student.setAddr("Aydhya");
		student.setAvgMarks(525.0);
		//count no of recored
		//System.out.println("no of student"+service.NoOfStudent());
		//find all recored
		//Iterable<Student> listStudent=service.findAllRecored();
		//service.findAllRecored().forEach(stud->System.out.println(stud.getSid()+"\t"+stud.getName()+"\t"+stud.getAddr()+"\t"+stud.getAvgMarks()));
		//System.out.println("===========================find by id");
		service.findAllRecored().forEach(System.out::println);
		//find by id
		System.out.println("===========================find by id");
		Iterable<Student> listOfStudent=	service.fetchByStudentId(List.of(103,102));
		listOfStudent.forEach(System.out::println);
	
	
	}

}
