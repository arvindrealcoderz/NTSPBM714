package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Student;

public interface IstudentRepo extends CrudRepository<Student, Integer> {

}
