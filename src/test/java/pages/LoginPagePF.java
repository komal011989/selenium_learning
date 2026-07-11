package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

WebDriver driver;
	
@FindBy(name="username")
WebElement username;

@FindBy(name="password")
WebElement password;

@FindBy(xpath="//button[@type='submit']")
WebElement loginBtn;

@FindBy(xpath="//button[@type='submit']")
List<WebElement> loginBtnList;

@FindBy(xpath="//h6[text()='Dashboard']")
WebElement dashboard;

@FindBy(xpath="//h6[text()='Dashboard']")
List<WebElement> dashboardText;


	public LoginPagePF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	  
		  
	    //method to open url
		public void openApplication(String url)
		{
			driver.get(url);
		}
	    
		//method to enter Username on login page
		public void enterUsername(String uname)
		{
			//driver.findElement(username).sendKeys(uname);
			username.sendKeys(uname);
		}
	
		
		//method to enter Password
		public void enterPassword(String pwd)
		{
			//driver.findElement(password).sendKeys(pwd);
			password.sendKeys(pwd);
		}
		
		//method to click on Login Button
		public void clickLogin()
		{
			//driver.findElement(loginBtn).click();
			loginBtn.click();
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
        	int found = dashboardText.size();
        	if(found == 1)
        		return true;
        	else
        		return false;
        }
        
        //method to check login Button
        public boolean isLoginButtonAbsent()
        {
        	int found =loginBtnList.size();
        	if(found == 0)
        		return true;
        	else
        		return false;
        }
        
 
}
        
