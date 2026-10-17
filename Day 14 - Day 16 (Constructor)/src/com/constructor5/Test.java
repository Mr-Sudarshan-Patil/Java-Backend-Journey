package com.constructor5;

public class Test {
	String name;
	int age;
	
	Test(String _name, int _age){
		this.name = _name;
		this.age = _age;
	}
	
	Test(){
		this("Sudarshan", 27);
	}
	
	 void printTest() {
		System.out.println("name");
		System.out.println(age);
	}
}
