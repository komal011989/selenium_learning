package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkillsPage{
	
	WebDriver driver;
	
	public SkillsPage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	//locators
	By loginBtn=By.xpath("//span[text()='Admin']");
	By qualificationBtn=By.xpath("//span[text()='Qualifications ']");
	By skillsBtn=By.xpath("//a[text()='Skills']");
	By addBtn=By.xpath("//button[text()=' Add ']");
	By skillName=By.xpath("//label[normalize-space()='Name']/ancestor::div[contains(@class,'oxd-input-group')]//input");
	By enterdescription=By.xpath("//textarea[@placeholder='Type description here']");
	By saveBtn=By.xpath("//button[@type='submit']");
	//By getskill=By.xpath("//div[text()='QA']");
	By getskill=By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']");
			
	By loader=By.className("oxd-form-loader");
	
	public void clickadmin() {
		
		driver.findElement(loginBtn).click();
	}
	
	public void clickQualifications() {
		
		driver.findElement(qualificationBtn).click();
	}
	
	public void clickSkills() {
		driver.findElement(skillsBtn).click();
	}
	
	public void clickaddBtn() {
		driver.findElement(addBtn).click();
	}
	
	public void enterName(String name) {
		driver.findElement(skillName).sendKeys(name);
	}
	
	public void enterDescription(String description) {
		driver.findElement(enterdescription).sendKeys(description);
	}
	
	public void clickSave() {
		driver.findElement(saveBtn).click();
	}
	
	public void addSkills(String sname,String sdescription) {
		
		clickadmin();
		
		clickQualifications();
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
	      
		clickSkills();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
		
		clickaddBtn();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
		enterName(sname);
		enterDescription(sdescription);
		clickSave();
	}
	
	public String getSkills(String sname) {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
	      List<WebElement> skills = driver.findElements(getskill);
	      
	      String result="";
	      for (WebElement skill : skills) {
	    	   result= skill.getText();
	    	   if(result.contains(sname))
	    		   break;
	    	   else
	    		   result="Not Found";
	    		  
	    		  
	}
	      return result;
	}
}


