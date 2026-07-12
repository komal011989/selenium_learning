package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	By skillName=By.xpath("//input[@fdprocessedid='wqppws']");
	By enterdescription=By.xpath("//textarea[@placeholder='Type description here']");
	By saveBtn=By.xpath("//button[@fdprocessedid='1qhqtx']");
	By getskill=By.xpath("//div[text()='QA']");
			
	
	
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
		clickSkills();
		enterName(sname);
		enterDescription(sdescription);
		clickSave();
	}
	
	public String getSkills() {
		
		String skill=driver.findElement(getskill).getText();
		return skill;
	}
}


