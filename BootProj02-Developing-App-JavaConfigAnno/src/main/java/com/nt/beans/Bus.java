package com.nt.beans;

import javax.inject.Named;

@Named("bus")
public class Bus implements IShowRoom{

	@Override
	public String moter() {
		System.out.println("Bus.moter()");
		return "volovo";
	}

	@Override
	public Double Price() {
		System.out.println("Bus.Price()");
		return 50000000.0;
	}

}
