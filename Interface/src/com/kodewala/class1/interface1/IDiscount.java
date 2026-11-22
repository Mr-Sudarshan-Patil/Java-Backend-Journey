package com.kodewala.class1.interface1;
//interface is not a real implementation it just an idea what we have to done in project and this just contract if we have to implement it then we have to follow and implement all method given in abstract
public interface IDiscount {
	
	int gst = 18; //automatical public static final : constant
	//if we not write public abstract java automaticall add public abstract
	public abstract void calculateDiscount(int ammount, int rate); 
	//abstract method without body
	//it is just 'What' part
	//and interface enforce to implement this method with whatever logic but you have to enforce it
	
}
