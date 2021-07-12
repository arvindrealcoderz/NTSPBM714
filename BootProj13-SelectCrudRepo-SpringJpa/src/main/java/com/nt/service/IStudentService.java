package com.nt.service;

import com.nt.entity.Student;

public interface IStudentService {
	public long NoOfStudent();
	public Iterable<Student> findAllRecored();
	public Iterable<Student> fetchByStudentId(Iterable<Integer> id);

}
