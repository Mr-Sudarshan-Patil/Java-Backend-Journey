package com.inheritance.single2;
//
//10. Person and Student
//Create a parent class Person with variables name and age. Create a child class Student with
//variable rollNo. Set the values and print all the details.
class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Student extends Person {
	int rollNo;
	
	Student(String name, int age, int rollNo){
		super(name, age);
		this.rollNo = rollNo;
	}
	
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Roll No: " + rollNo);
	}
}

public class Driver {

	public static void main(String[] args) {
		Student stud1 = new Student("Sudarshan Patil", 27, 56);
		stud1.printDetails();

	}

}
