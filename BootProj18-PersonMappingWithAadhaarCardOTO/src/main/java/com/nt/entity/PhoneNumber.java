package com.nt.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "OTO_Phone")
public class PhoneNumber {
	@Id
	@GeneratedValue(strategy = 	GenerationType.SEQUENCE,generator = "phone_id_seq")
	@SequenceGenerator(name = "phone_id_seq", initialValue = 10,allocationSize = 1)
	@Column(name = "phone_id")
	private Integer regNo;
	private Long phoneNo;
	

}
