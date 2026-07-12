package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SkillsPage;

public class SkillsTest extends BaseTest{
	
	@Test(dataProvider="skilldetails", priority=1)
	public void addSkills(String sname,String sdescription) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
	
		 String uname=p.getProperty("username");
		 String pwd=p.getProperty("password");
		 
		 lp.login(uname, pwd);
			
		SkillsPage sp=new SkillsPage(driver);
		
    	sp.addSkills(sname, sdescription);
    	
    	String actualname=sp.getSkills();
    	
    	 String expectedname=sname;
    	 
        Reporter.log("Skill Name:" +actualname, true);		
		
		Assert.assertEquals(actualname, expectedname);
    	
  
	}
	
	@DataProvider(name="skilldetails")
    public Object[][] getData()
    {

    	return new Object[][]
    {
    		{"QA","This is Quality Analyst"},
    		
    		
    };
    }

}
