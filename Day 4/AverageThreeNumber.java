// print average of 3 numbers with command line arguments


class AverageThreeNumber
{
	public static void main(String arr[])
	{
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		int num3 = Integer.parseInt(arr[2]);
		
		int avg = (num1 + num2 + num3) / 3;
		
		System.out.println("The average is " + avg);
	}
}