package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.repo.IStudentRepo;

@Service("studservice")
public class StudentMgmtService implements IStudentService {
	@Autowired
	private IStudentRepo repo;
	@Override
	public String save(Student stud) {
		System.out.println("StudentMgmtService.save()");
		System.out.println("proxy class object"+repo.getClass());
		Student student= repo.save(stud);
		
		return student!=null?"Student registration success":"Registration failed";
	}

}
