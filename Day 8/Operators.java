class Operators
{
	public static void main(String args[]){
		int minAge = 18; //asssignment operater used
		
		int userAge = Integer.parseInt(args[1]);
		String name = args[0];
		
		System.out.println("Name : " + name);
		System.out.println("Allowed to apply Driving Licence : " + (userAge > minAge));// true
	}
}