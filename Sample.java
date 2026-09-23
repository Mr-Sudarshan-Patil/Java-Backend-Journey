class Sample
{
	public static void main(String args[])
	{
		byte a = 126;
		byte b = 4;
		byte c = (byte)(a + b);
		System.out.println(c);  // lossy
	}
}