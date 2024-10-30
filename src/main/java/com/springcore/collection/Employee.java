package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee //collection type program
 {

	private int empId;
	
	private List <String> empName;
	private Set<String> empPhone;
	private Map<String,Integer> empAddress;
	
	public Employee() {	}

	public Employee(int empId, List<String> empName, Set<String> empPhone, Map<String, Integer> empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<String> getEmpName() {
		return empName;
	}

	public void setEmpName(List<String> empName) {
		this.empName = empName;
	}

	public Set<String> getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(Set<String> empPhone) {
		this.empPhone = empPhone;
	}

	public Map<String, Integer> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Map<String, Integer> empAddress) {
		this.empAddress = empAddress;
	}

//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empAddress="
//				+ empAddress + "]";
	//}
	
	
}
