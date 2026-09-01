public class AdditionTwoNumbers
{
	public static void main(String args[])
	{
		int a=5, b=6;
		int sum = a + b;
		System.out.println("Sum of a+b = "+sum);
		
		//calling methods
		int result = addTwoNumber(100,504);
		System.out.println("=========Two Number sended to Method: 100, 504=============");
		System.out.println("Get result from the method: "+ result);
	}
	
	//Solve sum with methods
	public static int addTwoNumber(int a, int b){
		return a+b;
	}
}