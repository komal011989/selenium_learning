package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.PIMpage;

public class PIMTest extends BaseTest{
	
    
	@Test(dataProvider="empdetails", priority=1)
	public void addEmployee(String fname,String mname,String lname,String eid) throws InterruptedException
	{
		
		LoginPage lp=new LoginPage(driver);
		
		 String uname=p.getProperty("username");
		 String pwd=p.getProperty("password");
		 
		lp.login(uname, pwd);
		
		PIMpage pp=new PIMpage(driver);
	
    	pp.addEmployee(fname, mname, lname,eid);
    	
    	String actualname=pp.getEmpName();
    	
    	 String expectedname=fname +" "+lname;
    	 
        Reporter.log("Employee Name:" +actualname, true);		
		
		Assert.assertEquals(actualname, expectedname);
    	
  
	}
	
	@DataProvider(name="empdetails")
    public Object[][] getData()
    {

    	return new Object[][]
    {
    		{"Komal" , "K", "K","1"},
    		
    		
    };
    }
}
