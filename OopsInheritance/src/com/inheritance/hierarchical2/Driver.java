package com.inheritance.hierarchical2;

//21. Employee, Teacher and Clerk
//Create a parent class Employee with name and salary. Create children Teacher with subject
//and Clerk with department. Print the details of both.


class Employee
{
	String name;
	int sallary;
	
	public Employee(String _name, int sallary) {
		this.name = _name;
		this.sallary = sallary;
	}
}

class Teacher extends Employee
{
	String subject; 
	
	public Teacher(String name, int sallary, String subject)
	{
		super(name, sallary);
		this.subject = subject;
	}
	
	public void printDetails() {
		System.out.println("======================");
		System.out.println("Name: " + name);
		System.out.println("Sallary: " + sallary);
		System.out.println("Subject: " + subject);
		System.out.println("======================");
	}
}

class Clerk extends Employee
{	
	String department;
	
	public Clerk(String name, int sallary, String department) {
		super(name, sallary);
		this.department = department;
	}
	
	public void printDetails() {
		System.out.println("======================");
		System.out.println("Name: " + name);
		System.out.println("Sallary: " + sallary);
		System.out.println("Department: " + department);
		System.out.println("======================");
	}
}

public class Driver {

	public static void main(String[] args) {
		Teacher t = new Teacher("Suresh Bishanoi Sir", 1000000, "Java Trainer");
		t.printDetails();
		
		Clerk c = new Clerk("Sudarshan Patil", 25000, "Developer");
		c.printDetails();

	}

}
