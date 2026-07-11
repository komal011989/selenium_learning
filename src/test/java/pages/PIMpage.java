package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PIMpage {
	
	WebDriver driver;
	
	//Constructor
	public PIMpage(WebDriver driver)
	{
		this.driver=driver;
	}

	//loctors
	By username=By.name("username");
	By password=By.name("password");
	By loginBtn=By.xpath("//button[@type='submit']");
	

   
	By pim=By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
    By addEmployee=By.xpath("//a[text()='Add Employee']");
    
    By firstName=By.xpath("//input[@name='firstName']");
    By middleName=By.xpath("//input[@name='middleName']");
    By lastName=By.xpath("//input[@name='lastName']");
    By submit=By.xpath("//button[@type='submit']");
    
    By loader=By.className("oxd-form-loader");
    
    By empname=By.xpath("//h6[@class='oxd-text oxd-text--h6 --strong']");
    By empid=By.xpath("//label[text()='Employee Id']//following::input[@class='oxd-input oxd-input--active']");

    public void clickPim() 
    {
    	driver.findElement(pim).click();
    }
    
 
    public void clickAddEmployee()
    {
	
	driver.findElement(addEmployee).click();
	}
    
    
    public void enterFirstname(String fname) 
    {
	driver.findElement(firstName).sendKeys(fname);
	
    }

    public void enterMiddleName(String mname) 
    {
	driver.findElement(middleName).sendKeys(mname);
	
    }

    public void enterLastName(String lname) 
   {
	driver.findElement(lastName).sendKeys(lname);
	
   }
    
   public void enterEmpId(String eid)
   {
	   
	   driver.findElement(empid).sendKeys(eid);
   }
   
   
    public void clickSubmit()
    {
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
    	driver.findElement(submit).click();
    }
    
    public void addEmployee(String fname,String mname,String lname,String eid)
    {
      clickPim();
      clickAddEmployee();
      enterFirstname(fname);
      enterMiddleName(mname);
      enterLastName(lname);
      enterEmpId(eid);
      clickSubmit();
    }
    
    	
    public String getEmpName() throws InterruptedException
    {
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-edit-employee-name']/h6")));
	     Thread.sleep(3000);
    	String ename=driver.findElement(empname).getText();
    	return ename;
    }
    	
    
}