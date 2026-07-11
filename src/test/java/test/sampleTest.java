package test;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class sampleTest {
	
	@Test(priority = 1)
	void PageTitle()
	{
		System.out.println("This is Page Title Test");
	}
	
	
	@Test(priority = 2,groups="smoke")
	void RegisterUser()
	{
		System.out.println("Registered Successfully");
		//org.testng.Assert.fail();
	}
	
	@Test(priority = 3,dependsOnMethods = "RegisterUser",dataProvider="testData",groups="smoke")
	void Login(String uname,String pwd)
	{
		
		System.out.println("This is Login");
		System.out.println("Username: "+uname);
		System.out.println("Password: "+pwd);
	}
	
	@Test(priority = 4)
	void AddEmployee()
	{
		System.out.println("This is Add Employee Test");
	}
	
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("This is Before Method");
		
	}
	@AfterMethod
	void afterMethod()
	{
		System.out.println("This is After Method");
		
	}
	@BeforeClass
	void beforeClass()
	{
		System.out.println("This is Before Class");
		
	}
	
	@AfterClass
	void afterClass()
	{
		System.out.println("This is After Class");
		
	}
	
	@DataProvider(name ="testData")
	public Object[][] loginData()
	{
		return new Object[][]
		{
			{"admin","admin123"},
			{"admin","admin"},
			{"admin123","admin123"},
			{"admin123","admin1234"}
			
				};
	}
	
	
	}

