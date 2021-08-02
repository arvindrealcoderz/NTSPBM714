package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data@Entity
@Table(name = "OTO_Aadhaar")
public class Aadhaar {
	@Id
	@GeneratedValue(generator = "reg_aadhaar_seq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name =  "reg_aadhaar_seq", initialValue = 1,allocationSize = 1)
	@Column(name = "")
	private Integer reg_aadhaar_no;
	@Column(name = "AADHAAR_CARD_NO")
	private Long aadhaar_no;

}
