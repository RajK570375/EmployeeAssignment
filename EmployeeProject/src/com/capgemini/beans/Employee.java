package com.capgemini.beans;

public class Employee {

	private int EmpId;
	private String name;
	private Address add;
	
	
	public Employee(String name, Address add) {
		super();
		this.name = name;
		this.add = add;
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "\nEmployeeId: " + EmpId + "\nName: " + name + "\nAddress: " + add + "";
		
	}	
	
}
