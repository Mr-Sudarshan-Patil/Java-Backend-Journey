package com.kodewala.company;

public class Company
{
	//Instance variables
	public String companyName = "C5I";
	private int sallary = 25000;
	
	
	public void showCompany(){
		//Object create to access the instance variable
		Company obj = new Company();
		System.out.println("====Company Details=========");
		System.out.println("companyName: " + obj.companyName);
		System.out.println("Password: " + obj.sallary);
	}
}