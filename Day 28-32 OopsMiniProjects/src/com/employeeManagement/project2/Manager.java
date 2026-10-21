package com.employeeManagement.project2;

public class Manager extends Employee {

	public Manager(String name, int sallary) {
		super(name, sallary);
	}
	
	public String displayRole() {
		return "Manager";
	}

}
