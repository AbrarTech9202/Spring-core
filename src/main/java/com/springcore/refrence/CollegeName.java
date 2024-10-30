package com.springcore.refrence;

public class CollegeName {

	private String clg_Name;

	public CollegeName() {	}

	public CollegeName(String clg_Name) {
		super();
		this.clg_Name = clg_Name;
	}

	public String getClg_Name() {
		return clg_Name;
	}

	public void setClg_Name(String clg_Name) {
		this.clg_Name = clg_Name;
	}

	@Override
	public String toString() {
		return "CollegeName [clg_Name=" + clg_Name + "]";
	}
	
	
	
}
