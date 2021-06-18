package com.nt.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime ldt;
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator class 0 param constructor ");
	}
	public String Wish(String user) {
		long hours=ldt.getHour();
		if(hours<12)
			return "good mornong "+user;
		else if(hours<16)
			return "good after noon "+user;
		else if(hours<20)
			return "good evening "+user;
		else
			return "good night "+user;
	}

}
