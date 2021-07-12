package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name= "sno")
	private Integer sid;
	@Column(name= "sname")
	private String name;
	@Column(name= "saddr")
	private String addr;
	@Column(name= "avg")
	private Double avgMarks;
	
	
}
