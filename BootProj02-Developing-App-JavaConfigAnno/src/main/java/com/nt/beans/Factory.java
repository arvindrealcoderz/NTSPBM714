package com.nt.beans;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

@Named("factory")
@ImportResource("com/nt/config/applicationContext.xml")
public class Factory {
	@Resource(name = "type")
	private IShowRoom showRoom;
	
	public String buyMoter(String user) {
		System.out.println("===========================");
		return "hello user your choice "+showRoom.moter()+" and cost is "+showRoom.Price();
	}
	

}
