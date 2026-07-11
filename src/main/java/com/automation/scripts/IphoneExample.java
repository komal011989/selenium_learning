package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
	     driver.manage().window().maximize();
	     driver.get("https://www.flipkart.com/");
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
	     driver.findElement(By.xpath("//span[text()='✕']")).click();

	     driver.findElement(By.name("q")).sendKeys("Iphone 16");
	     
	     WebElement search = driver.switchTo().activeElement();
	        search.sendKeys(Keys.ENTER);
	        
	     //driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
	    WebElement price=driver.findElement(By.xpath("//div[contains(text(),'iPhone 16')]/following::div[contains(text(),'₹')]"));
	      
	     System.out.println(price.getText());
	      
	}

}
