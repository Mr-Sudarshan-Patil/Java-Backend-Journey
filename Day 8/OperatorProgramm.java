class OperatorProgramm
{
	public static void main(String args[])
	{
		
		// Example: && Operator Check
		
		int age = Integer.parseInt(args[0]);
		
		int minAge = 18;
		int maxAge = 70;
		
		System.out.println("Minmum comparison check: " + (age > minAge));
		System.out.println("Maximu age check : Not more than 70: " + (age < maxAge));
		
		System.out.println("Eligible for vote: " + ((age > minAge) && (age < maxAge)));
	}
}