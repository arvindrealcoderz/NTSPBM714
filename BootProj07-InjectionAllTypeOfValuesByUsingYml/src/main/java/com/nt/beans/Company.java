package com.nt.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("com")
@Data
public class Company {
	private String title;
	private String location;
	private Integer size;

}
