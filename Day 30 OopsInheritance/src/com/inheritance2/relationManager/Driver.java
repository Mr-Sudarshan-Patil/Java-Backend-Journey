package com.inheritance2.relationManager;

class Employee {
	 String name = "Sudarshan";
	public int age = 27;

	public void methodEmp(String empId) {
		System.out.println(empId);
	}
}

class Manager extends Employee 
{
	public void managerMethod() {
		System.out.println(name);
		System.out.println(age);
		methodEmp("emp453");
		
	}
}
public class Driver extends Manager{

	public static void main(String[] args) {
		Manager obj = new Manager();
		obj.managerMethod();
	}

}
