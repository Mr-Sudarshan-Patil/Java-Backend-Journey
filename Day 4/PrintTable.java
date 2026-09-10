class PrintTable
{
	public static void main(String args[])
	{
		byte num = Byte.parseByte(args[0]);
		
		for(byte i = 1; i <= 10; i++)
		{
			System.out.println(i+"*"+num+"="+ (i*num));
		}
	}
}