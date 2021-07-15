package com.nt.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emp")
public class Employee {

	@Id
	@Column(name="empno")
	private Integer empNo;
	@Column(name="ename")
	private String empName;
	@Column(name="job")
	private String empJob;
	@Column(name="sal")
	private Double empSal;
	@Column(name="deptno")
	private Integer deptno;
	

}
