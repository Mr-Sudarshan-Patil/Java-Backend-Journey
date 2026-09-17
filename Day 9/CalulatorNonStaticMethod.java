class CalulatorNonStaticMethod
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		System.out.println(num1);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num2);
		
		CalulatorNonStaticMethod cls = new CalulatorNonStaticMethod();
		
		int addResult = cls.addNumber(num1, num2);
		System.out.println(addResult);
		
		int subResult = cls.subTwoNo(num1, num2);
		System.out.println(subResult);
		
		int mulResult = cls.mulMethod(num1, num2);
		System.out.println(mulResult);
		
		int divResult = cls.divMethod(num1, num2);
		System.out.println(divResult);
	}
	
	int addNumber(int a, int b) // 30 20
	{
		System.out.println("Enter in add method");
		return a+b; // 50
	}
	
	int subTwoNo(int a, int b)
	{
		System.out.println("Enter in substract method");
		return a-b;
	}
	
	int mulMethod(int a, int b)
	{
		System.out.println("Enter in multiplication method");
		return a*b;
	}
	
	int divMethod(int a, int b)
	{
		System.out.println("Enter in Division Method");
		if(b==0){
			return 0;
		}else{
			return a/b;
		}
	}
}