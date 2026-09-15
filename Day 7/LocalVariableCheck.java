class LocalVariableCheck
{
	static int price = 200; // Static or class variable
	
	public static void main(String args[])
	{
		int ammount = 100; // Local Variable
		System.out.println(ammount);
		
		localCheck();
	}
	
	static void localCheck(){
		// System.out.println("Printing Local variable in main method : " + ammount); // Local variable of main method
		
		/*
		Error:
		
		error: cannot find symbol
                System.out.println("Printing Local variable in main method : " + ammount); // Local variable of main method
				
		*/
		System.out.println("Printing Static variable : " + price);
		
		// Output : Printing Static variable : 200
	}
}


// Important question: Why java force to initialised value for local variable