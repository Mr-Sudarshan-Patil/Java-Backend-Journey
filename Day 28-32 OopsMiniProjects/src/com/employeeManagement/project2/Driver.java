package com.employeeManagement.project2;

public class Driver {

	public static void main(String[] args) {
		Developer d = new Developer("Sudarshan Patil", 25000);
		d.calculateBonus(10);
		d.getDetails();

		/*
		 * Name: Sudarshan Patil 
		 * Sallary: 25000 
		 * Role: Developer 
		 * Bonus: 2500
		 */
		Manager m = new Manager("Aadarsh Patil", 125000);
		m.calculateBonus(12);
		m.getDetails();
		/*
		 * Name: Aadarsh Patil 
		 * Sallary: 125000 
		 * Role: Manager 
		 * Bonus: 15000
		 * 
		 */
	}

}
