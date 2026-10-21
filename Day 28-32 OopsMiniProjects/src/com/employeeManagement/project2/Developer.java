package com.employeeManagement.project2;

public class Developer extends Employee{
	
	Developer(String name, int sallary) {
		super(name, sallary);
	}

	public String displayRole() {
		return "Developer";
	}
}
