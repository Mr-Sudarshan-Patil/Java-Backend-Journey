package com.kodewala.interface5.clonable;	

public class Account implements Cloneable{
	String name;

	public Account(String name) {
		super();
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
