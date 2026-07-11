package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	/*	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//locating element through absolute Xpath
		
	//	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("admin");
		
	//	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("123");
		
		
		//locating element through relative Xpath
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		
		driver.findElement(By.linkText("Logout")).click();*/
		
		
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		//Syntax:
		//tagname[text()='value']           Exact text match
		// tagname[contains(text(),'text')] Partial Text Match
		
	//driver.findElement(By.xpath("//a[text()='Images']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Ima')]")).click();
		
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf' and @name='q']")).sendKeys("Selenium Webdriver");
		
		//driver.quit();
		
				

		
	}

}
