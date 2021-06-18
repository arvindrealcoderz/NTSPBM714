package com.nt.beans;

import javax.inject.Named;

@Named("car")
public class Car implements IShowRoom {

	@Override
	public String moter() {
		System.out.println("Car.moter()");
		return "Bugatti Veyron Grand Sport";
	}

	@Override
	public Double Price() {
		System.out.println("Car.Price()");
		return 110000000.0;
	}

}
