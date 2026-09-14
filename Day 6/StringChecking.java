class StringChecking
{
	public static void main(String args[])
	{	
		String a = "mango";
		String b = "mango";
		
		if(a == b){
			System.out.println("Both Same");
		}
		else{
			System.out.println("Both are different");
		}
		
		if(a.equals(b)){
			System.out.println("Second String Both are Same");
		}else{
			System.out.println("Both are different");
		}
		
	}
}