package com.constructor3;

public class Driver {
	public static void main(String args[]) {
		//CarDetails("Nexon", 1200000.0, "TATA", "2024", 2026, true);
		//CarDetails("Baleno", 1000000.0, "Maruti Suzuki", "2021", 2026, false);
		CarDetails car1 = new CarDetails("Nexon", 1200000.0, "TATA", "2024", 2026, true);
		CarDetails car2 = new CarDetails("Baleno", 1000000.0, "Maruti Suzuki", "2021", 2026, false);
		car1.printCarDetails();
		car2.printCarDetails();
	}
}
