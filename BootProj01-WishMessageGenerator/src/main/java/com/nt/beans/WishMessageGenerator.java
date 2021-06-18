package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hello")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;
	
	public String getWishMessage(String user) {
		String msg="";
		Long hours= (long) ldt.getHour();
		if(hours<12)
			msg="Good Morning";
		else if(hours<16)
			msg="Good After noon";
		else if(hours<20)
			msg="Good Evening";
		else
			msg="Good Night ";
		return msg;
	}

}
