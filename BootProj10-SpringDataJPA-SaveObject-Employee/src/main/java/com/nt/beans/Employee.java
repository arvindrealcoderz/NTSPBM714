package com.nt.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "EMPLOYEE")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@Column(name = "empno")
	private Integer empNo;
	private String ename;
	private String job;
	private Double sal;
	
}
