package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {

	private Integer snNo;
	private Integer empNo;
	private String ename;
	private String job;
	private Double sal;
	private Integer deptNo;
	private Integer mgNo;
}
