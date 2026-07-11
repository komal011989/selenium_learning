package com.automation.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	
		//To remember driver.findElement()=returns a webElement,which u can store, and then u can use
		WebElement x=driver.findElement(By.name("firstname"));
		x.sendKeys("Komal");
		
		
	//	driver.findElement(By.name("firstname")).sendKeys("Komal");
		
		driver.findElement(By.name("lastname")).sendKeys("Kokane");
		
		driver.findElement(By.name("email")).sendKeys("kokanekomal.gmail.com");
		
		driver.findElement(By.name("telephone")).sendKeys("9999999990");
		
		driver.findElement(By.name("password")).sendKeys("kkk");
		
		driver.findElement(By.name("confirm")).sendKeys("kkk");
		
	 //	driver.findElement(By.linkText("Privacy Policy")).click();
		
		driver.findElement(By.partialLinkText("Privacy Policy")).click();
	//	driver.findElement(By.name("continue")).click();
	}

}
