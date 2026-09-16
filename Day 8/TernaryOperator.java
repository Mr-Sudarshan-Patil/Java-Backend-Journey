class TernaryOperator
{
	public static void main(String args[])
	{
		int age = Integer.parseInt(args[0]);
		
		int minAge = 18;
		
		String message = (minAge < age) ? "Allow Dl" : "Not Allow to DL";
		
		System.out.println(message);
	}
}