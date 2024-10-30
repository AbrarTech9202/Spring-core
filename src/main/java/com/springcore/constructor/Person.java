package com.springcore.constructor;

public class Person {

	private int pId;
	private String pName;
//	private Certie certie;
	
	public Person(int pId, String pName ) {
		super();
		this.pId = pId;
		this.pName = pName;
//		this.certie=certie;
	}

	@Override
	public String toString() {
		return this.pId+" "+this.pName;
	}
	
	
	
}
