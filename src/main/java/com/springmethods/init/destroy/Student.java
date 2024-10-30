package com.springmethods.init.destroy;

public class Student {

	private String StdName;

	public String getStdName() {
	
		return StdName;
	}

	public void setStdName(String stdName) {
		System.out.println("Started...");
		StdName = stdName;
	}

	public Student(String stdName) {
		super();
		StdName = stdName;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [StdName=" + StdName + "]";
	}
	public void init()
	{
		System.out.println("hello init methods...");
	}
	
	public void destroy()
	{
		System.out.println("hello destroy Methods...");
	}
}
