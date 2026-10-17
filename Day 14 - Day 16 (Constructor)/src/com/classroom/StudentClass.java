package com.classroom;

public class StudentClass {
//	Create a class Student with fields: name (String), rollNo (int), marks (double).
//	Write:
	
	String name;
	int rollNo;
	double marks;
	
	//Default constructor 
	StudentClass(){
		this.name = "Not Assigned";
	}
	
	StudentClass(String _name, int _rollNo, double _marks){
		this.name = _name;
		this.rollNo = _rollNo;
		this.marks = _marks;
	}
	
	
	void displayStudent() {
		System.out.println("============Student Details===================");
		System.out.println("Student Name:" + name);
		System.out.println("Roll No: " + rollNo);
		System.out.println("Marks: " + marks);
		System.out.println("==============================================");
	}
	

}
