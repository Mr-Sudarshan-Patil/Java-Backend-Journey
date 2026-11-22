package com.inheritance.multilevel2;

//16. Person, Employee and Developer
//Create Person with name, Employee with salary and Developer with language. Print all three
//values from a method in Developer.

class Person 
{
	String name; 
	
	 Person(String _name){
		this.name = _name;
	}
}

class Employee extends Person{
	int sallary;
	
	Employee(String name, int _sallary){
		super(name);
		this.sallary = _sallary;
		
	}
	
}

class Developer extends Employee{
	String language;
	Developer(String name, int _sallary, String lang){
		super(name, _sallary);
		this.language = lang;
	}
	
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Sallary: " + sallary);
		System.out.println("Language: " + language);
	}
}
public class Driver {

	public static void main(String[] args) {
		Developer obj = new Developer("Sudarshan Patil", 25000, "Java");
		obj.printDetails();

	}

}
