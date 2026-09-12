public class DataType
{
	static short ammount; 
	static byte num1;
	static int num2;
	static long num3;
	static float price;
	static double price2;
	static boolean status;
	static char ch;
	
	
	/*
	Note:
	-- Global Variables
		- In global variable if we dont assign any value in variable, it will take the default values
		- In Integer numbers e.g byte, short, int, long it will take default value as 0
		  - output: Ammount is: 0
		- In Decimal numbers e.g float, double it will take default value as 0.0
		  - output: Price is: 0.0
		- In Boolean it will take default value as false
		  - output: Status is: false
		- In Char it will not get any default value its blank
		  - output: Char is:__
		  
	--Local Variable 
		- In local variable it will not gives us the default value and if we dont assign any value in local variable it will gives us the error
		error: variable number might not have been initialized
             System.out.println(number); // gives any error to initialise the value
	*/
	public static void main(String args[])
	{
		/*
		
		byte amount = 128;
		System.out.println("Ammount is: " + amount);
		
		// byte - range (-128 to 127) if i enter out of range e.g -129 , 129 so it will gives us the error 
		//error: incompatible types: possible lossy conversion from int to byte
		
		*/
		
		short num = 2000;// this is local variable
		System.out.println(num);
		
		// short number;// this is local variable
		//System.out.println(number); // gives any error to initialise the value if not assign any value
		
		/*
		//Error:
		
		error: variable number might not have been initialized
                System.out.println(number); // gives any error to initialise the value
		
		*/
		
		//Printing Global variable
		System.out.println("Ammount is: " + ammount);
		System.out.println("num1 is: " + num1);
		System.out.println("num2 is: " + num2);
		System.out.println("num3 is: " + num3);
		System.out.println("Price is: " + price);
		System.out.println("Price2 is: " + price2);
		System.out.println("Status is: " + status);
		System.out.println("Char is: " + ch);
		
		
		Float num45 = 667.0f;
		System.out.println(num45);
		
		Integer num30 = 45;
		System.out.println(num30);
		
		
		
	}
}