package com.encapsulation.student;

public class Driver {

	public static void main(String[] args) {
		StudentClass stud = new StudentClass();
//		
//		stud.getDetails();
//		//stud.name = "Sagar";
//		stud.age = 24;
//		stud.getDetails();
		stud.setName("Sudarsha");
		stud.setAge(25);
		System.out.println(stud.getName());
		System.out.println(stud.getAge());
		System.out.println(stud.getClass());
		
		stud.name = "sagar"; // give error variable is private in encapsulation
		System.out.println(stud.getName()); // public variabe change the name 'sagar' and that is not the good way
		
		
	}

}
