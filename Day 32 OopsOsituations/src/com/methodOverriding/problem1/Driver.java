package com.methodOverriding.problem1;

public class Driver {

	public static void main(String[] args) {

		//Creating dog object and calling method
		Dog d = new Dog();
		d.makeSound2(); //==> Parent Method
		d.makeSound(); // ==> Parent Method ==> override in child ==> now calling child method
		
		Cat c = new Cat();
		c.makeSound2();
		c.makeSound();

	}

}
