package class2.com.exception6;

public class InvoiceService {
	public void generateInvoice() {
		
		try {
			connectDatabase();
			String name = "Sudarshan";
			name.lastIndexOf("e");
			
			System.out.println("Generating Invoice");
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			
			closingDatabase();
		}
	}
	
	private void connectDatabase() {
		System.out.println("Connecting database");
	}
	
	private void closingDatabase()
	{
		System.out.println("Clossing Database");
	}
}
