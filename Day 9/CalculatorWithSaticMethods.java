class CalculatorWithSaticMethods
{
	public static void main(String arsg[])
	{
		int num1 = Integer.parseInt(arsg[0]);
		System.out.println(num1);
		int num2 = Integer.parseInt(arsg[1]);
		System.out.println(num2);
		
		
		int addResult = CalculatorWithSaticMethods.addNumber(num1, num2);
		System.out.println(addResult);
		
		int subResult = CalculatorWithSaticMethods.subTwoNo(num1, num2);
		System.out.println(subResult);
		
		int mulResult = CalculatorWithSaticMethods.mulMethod(num1, num2);
		System.out.println(mulResult);
		
		int divResult = CalculatorWithSaticMethods.divMethod(num1, num2);
		System.out.println(divResult);
	
	}
	
	static int addNumber(int a, int b) // 30 20
	{
		System.out.println("Enter in add method");
		return a+b; // 50
	}
	
	static int subTwoNo(int a, int b)
	{
		System.out.println("Enter in substract method");
		return a-b;
	}
	
	static int mulMethod(int a, int b)
	{
		System.out.println("Enter in multiplication method");
		return a*b;
	}
	
	static int divMethod(int a, int b)
	{
		System.out.println("Enter in Division Method");
		if(b==0){
			return 0;
		}else{
			return a/b;
		}
	}
}