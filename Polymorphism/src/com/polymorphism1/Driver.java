package com.polymorphism1;


/*
 * Question 2 — Runtime polymorphism and upcasting
 * 
Create a parent class Animal with a method sound(). Create subclasses Dog and Cat, each overriding
sound() with different behavior. In main, use an Animal reference to refer first to a Dog object and then
to a Cat object. Call sound() after each assignment. What output do you expect, and where does
runtime polymorphism occur?
 * 
 * */

class Animal {
	public void sound() {
		System.out.print("Animal.sound()....Sound");
	}
}

class Dog extends Animal
{
	@Override
	public void sound() {
		System.out.println("Bark");
	}
}

class Cat extends Animal
{
	@Override
	public void sound() {
		System.out.println("Meou");
	}
}
public class Driver {

	public static void main(String[] args) {
		Animal o1 = new Dog();
		Animal o2 = new Cat();
		o1.sound();
		
		o2.sound();
	}

}
