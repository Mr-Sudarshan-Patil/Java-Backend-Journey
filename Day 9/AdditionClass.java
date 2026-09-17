class AdditionClass
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int result = AdditionClass.sumOfTwoNo(num1, num2);
		System.out.println(Addition is = result);
	}
	
	static int sumOfTwoNo(int num1, int num2){
		return num1 + num2;
	}
}	