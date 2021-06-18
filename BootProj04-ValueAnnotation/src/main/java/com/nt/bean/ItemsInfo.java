package com.nt.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("info")
@PropertySource("com/nt/commons/input.properties")
public class ItemsInfo {
	@Value("1")
	public int sno;
	@Value("Arvind Verma ")
	public String sname;
	@Value("Hydrabad")
	public String saddr;
	@Value("${info.marks1}")
	public float marks1;
	@Value("${info.marks2}")
	public float marks2;
	@Value("${info.marks3}")
	public float marks3;
	@Override
	public String toString() {
		return "ItemsInfo [sno=" + sno + ", sname=" + sname + ", saddr=" + saddr + ", marks1=" + marks1 + ", marks2="
				+ marks2 + ", marks3=" + marks3 + "]";
	}
	

	
	

}
