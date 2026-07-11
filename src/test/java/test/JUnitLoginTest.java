package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import base.JUnitBaseTest;
import pages.LoginPage;


public class JUnitLoginTest extends JUnitBaseTest{

	@Test()
	public void checkLoginPageTitle() {
		
		LoginPage lp=new LoginPage(driver);
		
		String actualTitle=lp.getTitle();
		String expectedTitle= "OrangeHRM";
				
		
		Assertions.assertEquals(expectedTitle, actualTitle);
	}

	@Test()
	public void verifyValidLogin()
	{
		
	 LoginPage lp=new LoginPage(driver);
	 
	 String uname=p.getProperty("username");
	 String pwd=p.getProperty("password");
	 
	 lp.login(uname,pwd);
	 
	 boolean status=lp.isDashboardDisplayed()&&lp.isLoginButtonAbsent();
	 
	 Assertions.assertTrue(status);
	 
	 
	}
	
}
