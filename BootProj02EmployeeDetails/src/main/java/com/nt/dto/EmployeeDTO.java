package com.nt.dto;

import org.springframework.data.relational.core.sql.In;

import lombok.Data;

@Data
public class EmployeeDTO {
	private Integer eno;
	private String ename;
	private String job;
	private Double salary;
}
