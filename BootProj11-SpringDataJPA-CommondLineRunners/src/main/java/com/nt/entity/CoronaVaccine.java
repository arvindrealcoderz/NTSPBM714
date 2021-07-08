package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table()
public class CoronaVaccine implements Serializable {

	//to make properties as ssingular ID properties and map with single PK column
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long regNo;
	@Column(length = 20)
	private String name;
	@Column(length = 20)
	private String company;
	@Column(length = 20)
	private String country;
	private Double price;
	
	//private Integer requiredDosaCount;
	
}
