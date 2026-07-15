package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	By getskill=By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']");
			
	By loader=By.className("oxd-form-loader");
	
	By edittextarea=By.xpath("//textarea[@placeholder='Type description here']");
	
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
	
	public void clickdelete(String sname) {
	     //Locator to select the given skill name 
		 driver.findElement(By.xpath("//div[text()='" + sname + "']/ancestor::div[@role='row']//span")).click();
		 
		 //Locator to click on Delete Button
		driver.findElement(By.xpath("//div[text()='" + sname + "']/following::i[@class='oxd-icon bi-trash']")).click();
		
		//Locator to click on popup delete button
		driver.findElement(By.xpath("//div[@role='document']/descendant::div[@class='orangehrm-modal-footer']/button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']/i")).click();
	}
	
	public void clickedit(String sname) {
		
		//Locator to select the given skill name
		driver.findElement(By.xpath("//div[text()='" + sname + "']/ancestor::div[@role='row']//span")).click();
		
		//Locator to click on edit button
		driver.findElement(By.xpath("//div[text()='" + sname + "']/following::i[@class='oxd-icon bi-pencil-fill']")).click();
	}
	
	public void editDescription(String sdescription) {
		
		WebElement description = driver.findElement(edittextarea);

		description.click();
		description.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		description.sendKeys(Keys.DELETE);
		description.sendKeys(sdescription);
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
	
	public String getSkills(String sname,String sdescription) {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
	      
	      List<WebElement> skills = driver.findElements(getskill);
	      List <WebElement>descriptions=driver.findElements(By.xpath("//div[text()='" + sname + "']/following::div[text()='" + sdescription + "']")); 
	     
	      String result="Not Found";
	      String resultDes="Not Found";
	      
	      for (WebElement skill : skills) {
	    	    if (skill.getText().equals(sname)) {
	    	        result = skill.getText();
	    	        break;
	    	    }
	    	}

	    	for (WebElement description : descriptions) {
	    	    if (description.getText().equals(sdescription)) {
	    	        resultDes = description.getText();
	    	        break;
	    	    }
	    	}

	    	return "Skill: " + result + " | Description: " + resultDes;
	}
	
	public void deleteSkill(String sname,String sdescription) {
		
	    clickadmin();
		
		clickQualifications();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
	      
		clickSkills();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
		
		getSkills(sname,sdescription);
		
        clickdelete(sname);
        
	}
	
	public void editSkill(String sname,String sdescription)
	{
		clickadmin();
		clickQualifications();
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
	      
		clickSkills();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
		
		getSkills(sname,sdescription);
		
		clickedit(sname);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
		
		editDescription(sdescription);
		
		clickSave();
		
	}
}


