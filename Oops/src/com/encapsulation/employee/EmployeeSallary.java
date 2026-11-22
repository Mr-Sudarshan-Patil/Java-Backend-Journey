package com.encapsulation.employee;
//Employee Salary: Create an Employee class with a private salary variable. Allow salary updates only when the salary is greater than zero.
public class EmployeeSallary {
	private int salary;
	
	public void setter(int salary) {
		if(salary > 0) {
			this.salary = salary;
		}else {
			System.out.println("Invalid");
		}
	}
	
	public int getter() {
		return salary;
	}
}
