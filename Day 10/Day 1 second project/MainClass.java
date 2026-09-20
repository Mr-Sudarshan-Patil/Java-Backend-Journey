import com.kodewala.users.User;
import com.kodewala.company.Company;

class MainClass
{
	public static void main(String args[])
	{
		//calling user 
		User obj = new User();
		obj.showUsers();
		
		//calling company
		Company obj1 = new Company();
		obj1.showCompany();
	}
}

/*

====User Details =========
Name: Sudarshan Patil
Password: sf4$3sdfs
====Company Details=========
companyName: C5I
Password: 25000

*/