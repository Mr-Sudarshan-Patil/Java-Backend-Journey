// 3 numbers some with commandline argument // step one argument convert to String to Interger first step 2: sum and print
public class CommandLineIntegerTest
{
	public static void main(String args[])
	{
		int num1 = Integer.parseInt(args[0]); // Converting string to integer e.g "10" ==> 10
		int num2 = Integer.parseInt(args[1]); // Converting string to integer e.g "10" ==> 10
		int num3 = Integer.parseInt(args[2]); // Converting string to integer e.g "10" ==> 10
		
		int Total = num1 + num2 + num3;
		
		System.out.println("Total is :" + Total);
	}
}