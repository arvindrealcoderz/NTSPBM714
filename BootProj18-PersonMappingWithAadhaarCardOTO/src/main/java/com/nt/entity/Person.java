package com.nt.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data@Entity
@Table(name = "OTO_Person")
public class Person {
	@Column(name = "PERSON_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	//@JoinColumn
	@Column(name = "PERSON_NAME")
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "phone_id")
	private PhoneNumber phone_id;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reg_aadhaar")
	private Aadhaar addhar_card_no;
	
	
}
