package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.LoginPagePF;

public class LoginTestPF extends BaseTest {
	
	

		@Test(priority=2)
		public void verifyValidLogin()
		{
			
		 LoginPagePF lp=new LoginPagePF(driver);
		 
		 String uname=p.getProperty("username");
		 String pwd=p.getProperty("password");
		 
		 lp.login(uname,pwd);
		 
		 boolean status=lp.isDashboardDisplayed()&&lp.isLoginButtonAbsent();
		 
		 Reporter.log("Valid Login Result:" +status,true);
		 
		 Assert.assertTrue(status);
		 
		 
		}
		

	    }


