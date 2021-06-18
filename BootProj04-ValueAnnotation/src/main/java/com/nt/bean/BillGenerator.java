package com.nt.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bill")
public class BillGenerator {
	//@Value("50")
	@Value("#{info.marks1+info.marks2+info.marks3}")
	public float totalPrice;
	
	@Autowired
	private ItemsInfo info;
	@Override
	public String toString() {
		return "BillGenerator [totalPrice=" + totalPrice + ", info=" + info + "]";
	}
	
	
	
	

}
