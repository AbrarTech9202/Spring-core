package com.springcore.refrence;

public class College {

	private int id;
	private String stdName;
	
	private CollegeName name;

	public College() {	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public CollegeName getName() {
		return name;
	}

	public void setName(CollegeName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", stdName=" + stdName + ", name=" + name + "]";
	}

	
	
	
}
