package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("person")
@PropertySource("myproperties.properties")
public class PersonBean {
	//hard codered
	/*
	@Value("1")
	public Integer pid;
	@Value("Arvind ")
	public String pname;
	@Value("Ayodhya")
	public String paddr;
	@Value("55.0")
	public Double sal;

	 */
	
	
	//read value from application.properties  file
	/*
	@Value("${person.pid}")
	public Integer pid;
	@Value("${person.pname}")
	public String pname;
	@Value("${person.addr}")
	public String paddr;
	@Value("${person.sal}")
	public Double sal;
	 */
	
	
		//read value from myproperties.properties  file
	
	@Value("${person.pid}")
	public Integer pid;
	@Value("${person.pname}")
	public String pname;
	@Value("${person.addr}")
	public String paddr;
	@Value("${person.sal}")
	public Double sal;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
