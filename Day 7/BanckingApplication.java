// variable Practice

//Instance variable
//Static variable 
//local variabale

//We have banck account and 5 accounholde each account holder having 3% of intrest race and this is your local city branch

//accounholder data such like name, accountNumber, age , mobileNumber
//common 3% of intrest rate 
//and local city branch

class BanckingApplication
{
	// instance variable
	String name;
	int accountNumber;
	byte age; 
	long mobileNumber;
	
	static int rateIntrest = 3;
	
	public static void main(String args[])
	{
		//local
		String branch = "Nandurbar"; // Local variable
		
		
		System.out.println("Branch: " + branch);
		BanckingApplication obj1 = new BanckingApplication();
		obj1.name = "Sudarshan Patil";
		obj1.accountNumber = 1233234243;
		obj1.age = 27;
		obj1.mobileNumber = 780472671;
		
		printStat(obj1.name, obj1.accountNumber, obj1.age, obj1.mobileNumber);
		
		obj1.rateIntrestMethod();
		
		
	}
	
	static void printStat(String a, int b, byte c, long d)
	{
		System.out.println("Name is : " + a);
		System.out.println("AccountNumber: " + b);
		System.out.println("Age" + c);
		System.out.println("Mobile Number: " + d);
	}
	
	void rateIntrestMethod(){
		
		BanckingApplication acc = new BanckingApplication();
		System.out.println("Your Account available rate of intrest is : " + rateIntrest);
	}
	
}