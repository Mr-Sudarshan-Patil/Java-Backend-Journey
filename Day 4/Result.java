class Result
{
	public static void main(String args[])
	{
		String name = args[0];
		int marks = Integer.parseInt(args[1]);
		
		if(marks>40){
			System.out.println("Student Pass");
		}
		else{
			System.out.println("Student Fail");
		}
	}
}