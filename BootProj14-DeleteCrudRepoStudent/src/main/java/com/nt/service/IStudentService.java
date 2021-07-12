package com.nt.service;

import com.nt.entity.Student;

public interface IStudentService {
	public void delete(Student stud);
	public Iterable<Student> findAllRecored();
	public Iterable<Student> fetchByStudentId(Iterable<Integer> id);

}
