package com.kodewal.string6;

//final class AccountMgmt { //use final on class: then this class cannot become parent.
//
//}
//
//class Account extends AccountMgmt{ // error 'AccountMgmt: The type Account cannot subclass the final class AccountMgmt"
//	
//}


class AccountMgmt { 
//	1 case
	public void doSomething() {
		//buy an android
	}
// method with final
	final public void doSomethin2() {
		//
	}
	
//	final int UPI_LIMIT = 100000;
//	
//	public void doSomething3() {
//		UPI_LIMIT = 200000;  //The final field AccountMgmt.UPI_LIMIT cannot be assigned
//	}
}

class Account extends AccountMgmt{ 
// 1 case : method overide
	public void doSomething() { // override this method: now we can change
		//buy an android
	}
	
// 2 case access parent method with added final keyword 
//	public void doSomethin2() { // gives error: Cannot override the final method from AccountMgmt
//		//
//	}
//	
}