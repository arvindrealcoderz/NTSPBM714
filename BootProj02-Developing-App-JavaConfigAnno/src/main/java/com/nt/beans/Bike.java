package com.nt.beans;

import javax.inject.Named;

@Named("bike")
public class Bike implements IShowRoom {

	@Override
	public String moter() {
		System.out.println("Bike.moter()");
		return "Royal Enfield";
	}

	@Override
	public Double Price() {
		System.out.println("Bike.Price()");
		return 1200000.0;
	}

}
