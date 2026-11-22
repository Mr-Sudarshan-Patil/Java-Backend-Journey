package com.encapsulation.employee;

public class Driver {
	public static void main(String args[])
	{
		EmployeeSallary emp1 = new EmployeeSallary();
		//emp1.sallary = 25000; //cant change due to encapsulation variable is private and only change by method for sequerity purpose
		emp1.setter(-180);
		System.out.println(emp1.getter());
		
		
		//give the validation if sallary greater than zero only set the value
	}
}
