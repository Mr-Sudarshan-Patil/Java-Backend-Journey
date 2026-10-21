package com.inheritance.multilevel4;
//
//18. Constructor Order
//Create classes A, B and C in a chain. Each class has a constructor that prints its own name.
//Create an object of C and find the order of the output.

class A
{
	A()
	{
		System.out.println("A");
	}
}

class B extends A 
{
	B()
	{
	super();
	System.out.println("B");
	}
}

class C extends B
{
	C()
	{
		super();
		System.out.println("C");
	}
}
public class Driver {

	public static void main(String[] args) {
		C c = new C();

	}

}
