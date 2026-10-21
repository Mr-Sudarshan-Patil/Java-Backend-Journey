package com.inheritance.multilevel3;

//17. School Chain
//Create School, Class10 and Student10 in a chain. Each class has one method that prints a
//line about its own level. Call all methods using one Student10 object.

class School
{
	public void schoolMethod() {
		System.out.println("School");
	}
	
}

class Class10 extends School 
{
	public void classMethod()
	{	
		System.out.println("Class 10");
	
	}
}

class Student10 extends Class10
{
	public void studentMethod() {
		System.out.println("Student");
	}
}

public class Driver {

	public static void main(String[] args) {
		Student10 stud = new Student10();
		stud.schoolMethod();
		stud.classMethod();
		stud.studentMethod();
	}

}
