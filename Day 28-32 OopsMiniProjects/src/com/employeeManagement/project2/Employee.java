package com.employeeManagement.project2;

public class Employee {
	private String name;
	private int sallary;
	private int bonus;
	
	Employee(String name, int sallary){
		this.name = name;
		validateSallary(sallary);
	}
	
	//accordingly to gov low sallary not less than 15k i written as sample 
	private void validateSallary(int sallary) {
		if(sallary < 10000) {
			System.err.println("Sallary must greater that 10000");
		}else {
			this.sallary = sallary;
		}
	}
	
	public String displayRole() {
		return "Employee";
	}
	
	public void getDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Sallary: " + sallary);
		System.out.println("Role: " + displayRole());
		System.out.println("Bonus: " + bonus);
	}
	
	// Method 1: No input
    public void calculateBonus() {
        this.bonus = 1000;
    }

    // Method 2: One int input
    public void calculateBonus(int bonusPercentage) {
        this.bonus = ((this.sallary * bonusPercentage )/ 100);
    }

}
