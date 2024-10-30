package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	 
	private Address address;
	
	public Emp() {
		
	}
	
	public Emp(Address address) {
		super();
		this.address = address;
		
	}

	public Address getAddress() {
		
		return address;
	}
	
	public void setAddress(Address address) {
		
		this.address = address;
		
	}
	
}
