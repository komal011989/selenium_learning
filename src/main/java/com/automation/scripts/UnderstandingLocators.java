package com.automation.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Selenium_project/HTML/loginpage.html");
		
		driver.findElement(By.id("username")).sendKeys("Komal");
		
		driver.findElement(By.name("pass")).sendKeys("Komal");
		
		driver.findElement(By.id("loginBtn")).click();
		
		
		
	}

}
