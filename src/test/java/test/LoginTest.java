package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.LoginPagePF;


public class LoginTest extends BaseTest{
	
	
	@Test(priority=1)
	public void checkLoginPageTitle() {
		
		LoginPage lp=new LoginPage(driver);
		
		String actualTitle=lp.getTitle();
		String expectedTitle= "OrangeHRM";
				
		System.out.println("This is added for 2nd commit for Github");
		Reporter.log("Page Title " +actualTitle, true);		
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

	@Test(priority=2)
	public void verifyValidLogin()
	{
		
	 LoginPage lp=new LoginPage(driver);
	 
	 String uname=p.getProperty("username");
	 String pwd=p.getProperty("password");
	 
	 lp.login(uname,pwd);
	 
	 boolean status=lp.isDashboardDisplayed()&&lp.isLoginButtonAbsent();
	 
	 Reporter.log("Valid Login Result:" +status,true);
	 
	 Assert.assertTrue(status);
	 
	 
	}
	
	@Test(dataProvider="loginData",priority=3)
	public void verifyLogin(String uname,String pwd,boolean expected)
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.login(uname,pwd);
		
		boolean actual; 
		
		if(expected==true)
		{
		 actual=lp.isDashboardDisplayed() && lp.isLoginButtonAbsent();
		
		}
		else
		{
		actual=	lp.isErrorMsgDisplayed() && !lp.isLoginButtonAbsent();
		}
		
	    if(actual==true)
	    {
		Reporter.log("Login verified successful ", true);
		Assert.assertTrue(actual);
	    } 
	    else
	    {
	    	Reporter.log("login verified not successful",true);
	    	Assert.fail();
	    }
		
	}
	
    @DataProvider(name="loginData")
    public Object[][] getData()
    {

    	return new Object[][]
    {
    		{"Admin" , "admin123", true},
    		{"Admin","wrong",false},
    		{"wrong","admin123",false},
    		{"wrong","wrong",false}
    		
    };
    }
}
  