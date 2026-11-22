package com.inheritance.multilevel;
//
//14. Grandfather, Father and Son
//Create the classes Grandfather, Father and Son in a chain. Each class has one method. Call
//all three methods using a Son object.


class GrandFather
{
	public void property() {
		System.out.println("GrandFathers property");
	}
}

class Father extends GrandFather{
	public void property1() {
		System.out.println("Fathers Property");
	}
}

class Son extends Father{
	public void property2() {
		System.out.print("Child access above all properties");
	}
	
	
}
public class Driver {

	public static void main(String[] args) {
		Son child1 = new Son();
		
		child1.property();
		child1.property1();
		child1.property2();

	}

}
