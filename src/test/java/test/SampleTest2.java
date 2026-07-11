package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class SampleTest2 {
	
	private WebDriver driver;
	
	
@BeforeMethod

public void setup() {
	
	//Initialize the driver here
	 driver=new ChromeDriver();
	
	//Implicit Synchronization
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
	//Maximize Browser
	driver.manage().window().maximize();
     
	//open page
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
}
	
@AfterMethod

public void closeBrowser()
{
  driver.quit();	
}

@Test(priority=1)
public void chkTitle()
{
	 String expectedTitle="OrangeHRM";
     String actualTitle=driver.getTitle();
     
     System.out.println("Actual Title is: "+actualTitle);
     
     if(actualTitle.contentEquals(expectedTitle)) {
    	 
    	 org.testng.Reporter.log("Title Same...Orange HRM Open correctly", true);
    	 
    	// System.out.print("Title same....Test passed");
     }
     else
     {
    	 org.testng.Reporter.log("Title not same...Orange HRM Page not opened", true);
    	Assert.fail();
    	 //System.out.print("Title not same....Test Failed");
     }
}

@Test(dataProvider="loginData",priority=2)
public void verifyLogin(String uname,String pwd,String expected)
{
	driver.findElement(By.name("username")).sendKeys(uname);
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	int foundDashboard = driver.findElements(By.xpath("//h6[text()='Dashboard']")).size();
    int foundLoginButton=driver.findElements(By.xpath("//button[@type='submit']")).size();
    int foundErrorMsg= driver.findElements(By.xpath("//p[text() = 'Invalid credentials']")).size();

    if(expected.equals("valid"))
    {
    	if((foundDashboard==1)&&(foundLoginButton==0))
    	{
            
    		org.testng.Reporter.log("Login is Successful with Valid Credentials=Test passed", true);
    	}
    		else
    		{ 
    			org.testng.Reporter.log("Login is Not Successful with Valid Credentials=Test Failed",true);
    	    	Assert.fail();			
    	}
    	}
    	else
    	{
    		if((foundErrorMsg==1)&&(foundLoginButton==1))
             org.testng.Reporter.log("Login is not Successful with Invalid Credentials-Test passed", true);
    	
             else
             {
            	 org.testng.Reporter.log("Test Failed", true);
            	 Assert.fail();
            	 
            	 
             }
             
    	}
}

@DataProvider(name="loginData")
public Object[][] getData()
{

	return new Object[][]
{
		{"Admin" , "admin123", "valid"},
		{"Admin","wrong","invalid"},
		{"wrong","admin123","invalid"},
		{"wrong","wrong","invalid"}
		
			};
}
};
