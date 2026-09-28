package com.classroom;

public class Main {

	public static void main(String[] args) {
		System.out.println("Programm starts from main");
		
		//creating object : default
		StudentClass stud = new StudentClass();
		stud.displayStudent();
		
		//creating object: Parameterized 
		StudentClass stud1 = new StudentClass("Sudarshan Patil", 45, 83.86);
		stud1.displayStudent();

	}

}
