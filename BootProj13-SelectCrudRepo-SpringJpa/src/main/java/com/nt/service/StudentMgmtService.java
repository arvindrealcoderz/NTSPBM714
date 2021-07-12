package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.repo.IstudentRepo;
@Service("studentservice")
public class StudentMgmtService implements IStudentService {

	@Autowired
	private IstudentRepo repo;
	@Override
	public long NoOfStudent() {
		return repo.count();
	}
	@Override
	public Iterable<Student> findAllRecored() {
		
		return repo.findAll();
	}
	@Override
	public Iterable<Student> fetchByStudentId(Iterable<Integer> id) {
		return repo.findAllById(id);
	}
	

}
