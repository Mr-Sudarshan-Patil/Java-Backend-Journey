package com.inheritance.hierarchical;


//19. Animal, Dog and Cat
//Create a parent class Animal with eat(). Create two children, Dog with bark() and Cat with
//meow(). Call the methods using both objects.


class Animal
{
	public void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("Bark...");
	}
}

class Cat extends Animal
{
	public void meow() {
		System.out.println("Meow...");
	}
}

public class Driver {

	public static void main(String[] args) {
		//Object Create : Dog
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		//Objec Create : Cat
		Cat c = new Cat();
		c.eat();
		c.meow();

	}

}
