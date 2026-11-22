package com.kodewala.exception1;

class Account
{
	
}

public class Driver {

	public static void main(String[] args) 
	{
		System.out.println("Driver.main().. START");
		
		//NullPointException ===========================start ========================
		
		//eg1
		
		//String name = "Kodewala"; // This may be null ?
		
		
		//String name = null;
		
		//name.length() --> performing operation on name and 
       //					calculating the total length
	
		//System.out.println(name.length()); //8 --> name.whatever()
		
		
		//null.length(); // this is not a valid operation and it give nullpointerexception
		
			
		//eg2=>Null pointer
		//Account account = null;
		
		//System.out.println(account.hashCode()); //Cannot invoke "Object.hashCode()" because "account" is null
			
	  //NullPointerExtecption end ========================end==============
		//ArrayIndexOutBountException Start example =================Start=====================
		
		//String address = args[0]; // if not pass any argument then gives ArrayIndexOutOfBoundException 
		
		
		//System.out.println(address); 
		
		//ArrayIndexOutBountException end example ======================================
		
		//Arethmatic exception start eg ========================Start=======================
//		
//		int num = 100;
//		int cal = 100/0; //java.lang.ArithmeticException: / by zero
//		System.out.println(cal);
		
		//Arethmatic exception end eg ===============================================
		
		
	//suppling two input string and interger 
		
		String name = args[0];
		int marks = Integer.parseInt(args[1]); // if not pass number then give numberFormatException
		
		System.out.println(name);
		System.out.println(marks);
		
		
		System.out.println("Driver.main().. END");
	}
}
