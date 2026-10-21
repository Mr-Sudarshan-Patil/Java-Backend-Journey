package com.methodOverloading.problem3;

public class Driver {
	//this method print only name
	public void display(String name) {
		System.out.println("============");
		System.out.println("Name: " + name);
		System.out.println("============");
	}
	
	//this method print name and age
	public void display(String name , int age) {
		System.out.println("============");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("============");
	}
	
	public void display(int  empId) {
		System.out.println("==========");
		System.out.println("Employee Id: " + empId);
		System.out.println("==========");
	}
	
	public static void main(String[] args) {
		Driver obj = new Driver();
		obj.display("Sudarshan");
		obj.display("Sudarshan Patil", 27);
		obj.display(45643);

	}

}
