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
        
    	
    	String actualName=sp.getSkills(sname,sdescription);
    	
         String expectedName="Skill: " + sname + " | Description: " + sdescription;
    	 
        Reporter.log("New Skill Created with name:" +actualName, true);		
		
		Assert.assertEquals(actualName, expectedName);
    	
	}
	
    @Test(dataProvider="skilldetails", priority=3)
	public void deleteSkill(String sname,String sdescription) {
		
    	LoginPage lp=new LoginPage(driver);
    	
		 String uname=p.getProperty("username");
		 String pwd=p.getProperty("password");
		 
		 lp.login(uname, pwd);
		 
		SkillsPage sp=new SkillsPage(driver);
	
		sp.deleteSkill(sname,sdescription);
		
		sp.getSkills(sname,sdescription);
		String actualName=sp.getSkills(sname,sdescription);
    	
        String expectedName="Skill: " + "Not Found" + " | Description: " + "Not Found";
   	 
       Reporter.log("Skill Not Found:" +actualName, true);		
		
		Assert.assertEquals(actualName, expectedName);
   	
	}
    
    @Test(dataProvider="editeddetails", priority=2)
   	public void editSkill(String sname,String sdescription) {
   		
       	LoginPage lp=new LoginPage(driver);
       	
   		 String uname=p.getProperty("username");
   		 String pwd=p.getProperty("password");
   		 
   		 lp.login(uname, pwd);
   		 
   		SkillsPage sp=new SkillsPage(driver);
   		sp.editSkill(sname,sdescription);
   		
   		String actualName=sp.getSkills(sname, sdescription);
   		
   		String expectedName="Skill: " + sname + " | Description: " + sdescription;
   		
   	   Reporter.log("Skill edited " +actualName, true);		
   		Assert.assertEquals(actualName, expectedName);
    }
	
	@DataProvider(name="skilldetails")
    public Object[][] getData()
    {

    	return new Object[][]
    {
    		{"QA","This is Quality Analyst"},
    		
    		
    };
    }
 
	@DataProvider(name="editeddetails")
    public Object[][] editData()
    {

    	return new Object[][]
    {
    		{"QA","This is Quality Analyst Skill"},
    		
    		
    };
    }
}
