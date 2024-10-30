package com.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class Project {
  
	@Autowired
	private Employee emp;

	public Employee getEmp() {
		return emp;
	}
	
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	@Override
	public String toString() {
		return "Project []";
	}
	
	
	
}
