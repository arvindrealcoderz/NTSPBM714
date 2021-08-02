package com.nt.dao;

import org.aspectj.weaver.patterns.PerObject;
import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Person;

public interface IPersonDao extends CrudRepository<Person, Integer>{

}
