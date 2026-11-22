package class3.com.kodewala.exception1;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException {
		//String name= null;
		//System.out.println(name.length()); // nullPointException but runtime compile not check 
		
		
		//Checked Exception
		
		String className = "class3.com.kodewala.exception1.Driver2";
		
//		try {
//			Class.forName(className);
//			System.out.println("Class Loaded in metaspace.... ");
//		}
//		catch(Exception e) {
////			System.out.println(e);
//			e.printStackTrace();
//		}
		
		Class.forName(className);
		System.out.print("Class Loaded in metaspace");
		
		

	}

}
