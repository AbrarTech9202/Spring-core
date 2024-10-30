package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
  
	private String name;
	private String cityName;
	
	@Autowired
	public Address() {
		super();
	
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
		
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	@Override
	public String toString() {
		return "Address [name=" + name + ", cityName=" + cityName + "]";
	}
	
	
}
