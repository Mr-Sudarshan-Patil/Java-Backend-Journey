package com.methodOverriding.problem1;


//i'm using hirarcy inheritance of this classes: two child class that is dog and cat override the method of makesound()

//Parent Class

public class Animal {
	public void makeSound() {
		System.out.println("Sounds of animal");
	}
	
	public void makeSound2() {
		System.out.println("This method from animal");
	}
}


//child class - 1 : Dog
class Dog extends Animal{
	
	//indirectly parent method after extend available in this class that not show but avalable
	//now both method makeSound and makeSound2 available here
	//first method i override here when i call that override method it will provide new changed method 
	
	/*
	  public void makeSound() {
		System.out.println("Sounds of animal");
	}
	
	public void makeSound2() {  // Dog object==> makeSound2
		System.out.println("This method from animal");
	}
	 * 
	 * */
	public void makeSound(){ // Dog object refer ==> makeSound
		System.out.println("Bark");
	}
}

//child class - 2 : Cat

class Cat extends Animal
{
	public void makeSound() 
	{
		System.out.println("Meow");
	}
}