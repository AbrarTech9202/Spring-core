package com.springcore;

public class Student {

	private int StdId;
	private String StdName;
	private String StdAddress;
	
	
	
	public Student() {	}

	public Student(int stdId, String stdName, String stdAddress) {
		super();
		StdId = stdId;
		StdName = stdName;
		StdAddress = stdAddress;
	}


	public int getStdId() {
		return StdId;
	}

	public void setStdId(int stdId) {
		StdId = stdId;
	}

	public String getStdName() {
		return StdName;
	}

	public void setStdName(String stdName) {
		StdName = stdName;
	}

	public String getStdAddress() {
		return StdAddress;
	}

	public void setStdAddress(String stdAddress) {
		StdAddress = stdAddress;
	}

	@Override
	public String toString() {
		return "Student [StdId=" + StdId + ", StdName=" + StdName + ", StdAddress=" + StdAddress + "]";
	}
	
}
