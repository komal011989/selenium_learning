package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}	
	    //locators
		By username=By.name("username");
		By password=By.name("password");
		By loginBtn=By.xpath("//button[@type='submit']");
		
	   
	    By errorMsg= By.xpath("//p[text() = 'Invalid credentials']");    
	    By dashboardText=By.xpath("//h6[text()='Dashboard']");
	    
	    
	    //method to open url
		public void openApplication(String url)
		{
			driver.get(url);
		}
	    
		//method to enter Username on login page
		public void enterUsername(String uname)
		{
			driver.findElement(username).sendKeys(uname);
		}
	
		//method to get the Username
		public String getUsername()
		{
			String str=driver.findElement(username).getText();
			return str;
		}

		//method to enter Password
		public void enterPassword(String pwd)
		{
			driver.findElement(password).sendKeys(pwd);
			
		}
		
		//method to click on Login Button
		public void clickLogin()
		{
			driver.findElement(loginBtn).click();
			
		}
		
		//method to get the Title of page
		public String getTitle()
		{
			return driver.getTitle();
		}
		
		//Method for Login
		public void login(String uname,String pwd)
		{
			enterUsername(uname);
			enterPassword(pwd);
			clickLogin();
		}
		
		//method to check whether login is successful
        public boolean isDashboardDisplayed()
        {
        	int found = driver.findElements(dashboardText).size();
        	if(found == 1)
        		return true;
        	else
        		return false;
        }
        
        //method to check login Button
        public boolean isLoginButtonAbsent()
        {
        	int found =driver.findElements(loginBtn).size();
        	if(found == 0)
        		return true;
        	else
        		return false;
        }
        
        //Error Message Displayed
        public boolean isErrorMsgDisplayed()
        {
        	int foundErrorMsg=driver.findElements(errorMsg).size();
        	
        	if(foundErrorMsg==1)
        	return true;
        	else
        		return false;
        }
}
        
        
        
