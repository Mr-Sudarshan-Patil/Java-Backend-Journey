package com.kodewala.class1.interface6;

public class Driver {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Sudarshan");
		Security.checkSecurity(emp1);  // asume this is authorise working that company this only access the data
		
		TcsEmployee emp2 = new TcsEmployee("Sagar");
		Security.checkSecurity(emp2); // this is outsider not access company details

	}

}
