package com.automation.scripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.istqb.in/index.php");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	     WebElement specialist=driver.findElement(By.linkText("SPECIALIST"));
	     
	     Actions act=new Actions(driver);
	     act.moveToElement(specialist).build().perform();
	     Thread.sleep(1000);
	     
	     WebElement procedure=driver.findElement(By.linkText("PROCEDURE"));
	     
	     act.moveToElement(procedure).build().perform();
	     act.click().build().perform();
	     
	     Thread.sleep(3000);
	     
	     driver.navigate().back();
	     
	     Thread.sleep(2000);
	     
	     specialist=driver.findElement(By.linkText("SPECIALIST"));
	     act.moveToElement(specialist).build().perform();
	     Thread.sleep(2000);
	     
	     List<WebElement> suboptions=driver.findElements(By.xpath("//a[@href='/specialist']/following-sibling::div//li"));
	     
	     for(WebElement we:suboptions)
	     {
	    	 System.out.println(we.getText());
	     }
	     
	     driver.quit();
	     
	     
	     
	}
	

}
