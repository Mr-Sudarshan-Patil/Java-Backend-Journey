package com.string2;

public class Driver {

	public static void main(String[] args) {
		QueryGenerator query = new QueryGenerator();
		StringBuilder result = query.generateQuery(12000, null);
		System.out.println(result);
	}

}
