package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CORONA_VACCINE")
public class CoronaPatient {
	@Id
	private Integer regNo;
	private String name;
	private String country;
	private String company;
	private Double price;
	

}
