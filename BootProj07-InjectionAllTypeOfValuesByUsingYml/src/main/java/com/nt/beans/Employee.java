package com.nt.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix = "emp.info")
public class Employee {

	private Integer id;
	private String name;
	private String address;
	//Create Array.
	private String[] friends;
	//List collection
	private List<String> teamMember;
	//set collection
	private Set<Long> mobileNumber;
	//Map collection
	private Map<String,Object> idDetails;
	
	
	
	//Has-A properties
	private Company companyDetails;
	
	
	
}
