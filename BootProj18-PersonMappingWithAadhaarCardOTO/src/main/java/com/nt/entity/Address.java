package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "OTO_ADDRESS")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "address_seq")
	@SequenceGenerator(initialValue = 10,name = "address_seq",allocationSize = 1)
	@Column(name = "address_id")
	private Integer stNo;
	private String cityName;
	

}
