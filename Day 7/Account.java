class Account
{	
	// Instance variable: each oject create his own copy and we can say this is schema of every object created by this class
	
	String name = "Sudarshan Patil";
	int accountBalance = 2500;
	
	// Static variable: It used in entier class but, under the boundries
	
	static int intrest = 3;
	
	static int productAmmount = 200;
	
	public static void main(String args[])
	{
		// Creating object of account class to access the Instance variable inside the class

		Account acc = new Account();
		
		// Printing instance variables
		System.out.println("Name : " + acc.name);
		System.out.println("Account Balance : " + acc.accountBalance);
		
		//Printing a static variable 
		System.out.println("Intrest " + intrest + "%");
	
		doSomething(); // static method calling // Why its working because we already using static main method that refering to clss Account.main();
		
		Account.doSomething(); // static method calling method is static and that refer to class account so dont need to create objec insted we call them with class need
		
		//		Account acc = new Account();
		acc.doNothing();// donothing is non static method for that i have to create object then only we can access it
	}
	
	static void doSomething()
	{
			System.out.println("Do Something");
	}
	

	
	void doNothing(){
		System.out.println("Do Nothing.....");
	}

}

/*
//Note: 

Instance variable => copy the instatnce variable and use each object like a schema and every object assign there own values
Static variable => same value access to entier class

e.g

We have creating banck account 
	- we have lots of user in banck to created there bank account and every user having some comman identities
	-like, name, age, bankAccount 
	- suppose we have create a variable for every object and we have 1000 user means we are creating 1000*3 varible in
		each object then it will take heigh space , Insted of we use instance class we only write onece and use multiple times with own value take long space 
	-- insted we create instance class variable that declared onece and use in every object 
	
	static varibale -- we use we entire class access them meant common entities like back provide rate of intrest to every object same 3% i will define comman and access in enteri code
	
	local variable - it access only it own method block and local variable

*/