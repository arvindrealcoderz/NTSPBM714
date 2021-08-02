package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IPersonDao;
import com.nt.entity.Person;

@Service("personImpl")

public class PersonServiceImpl implements IPerson {

	@Autowired
	private IPersonDao dao;
	@Override
	public String Save(Person person) {
		Person per=dao.save(person);
		return per!=null?"Recored Inserted Successs":"Recored not inserted";
	}

}
