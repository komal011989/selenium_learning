package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandlingKeyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	     driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.findElement(By.name("firstname")).sendKeys("Anita");
	     
	     WebElement currentElement=driver.switchTo().activeElement();
	     
	     currentElement.sendKeys(Keys.TAB);
			Thread.sleep(2000);
	
	     currentElement=driver.switchTo().activeElement();
	     currentElement.sendKeys("Sharmi");
	     currentElement.sendKeys(Keys.TAB);
	     
	     currentElement=driver.switchTo().activeElement();
	     currentElement.sendKeys("xyz@gmail.com");
	     
	     currentElement.sendKeys(Keys.chord(Keys.SHIFT,Keys.TAB));
	     
	     currentElement=driver.switchTo().activeElement();
	     
	     Thread.sleep(1000);
	     currentElement.sendKeys(Keys.DELETE);
	     currentElement.sendKeys("Sharma");
	     
	     currentElement.sendKeys(Keys.TAB);
	     
	     
	     currentElement=driver.switchTo().activeElement();
	     currentElement.sendKeys(Keys.TAB);
	     
	     currentElement=driver.switchTo().activeElement();
	     currentElement.sendKeys("999999999");
	     
	      currentElement.sendKeys(Keys.TAB);
	     
	     currentElement=driver.switchTo().activeElement();
	     currentElement.sendKeys("komal");
	     
	     currentElement.sendKeys(Keys.TAB);
	     
	     currentElement=driver.switchTo().activeElement();
	     currentElement.sendKeys("komal");
	     
	     currentElement.sendKeys(Keys.TAB);
	     currentElement=driver.switchTo().activeElement();
	     
	     currentElement.sendKeys(Keys.ARROW_RIGHT);
	    
	     currentElement=driver.switchTo().activeElement();
	     currentElement.click();
	     
	     currentElement.sendKeys(Keys.TAB);
	     
	     currentElement=driver.switchTo().activeElement();
	     
	     currentElement.sendKeys(Keys.TAB);
	     
	     currentElement=driver.switchTo().activeElement();
	     currentElement.click();
	     
	     currentElement.sendKeys(Keys.TAB);
	     currentElement=driver.switchTo().activeElement();
	     
	     currentElement.click();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
