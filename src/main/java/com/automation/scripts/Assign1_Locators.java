package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assign1_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

      WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     
	     
	     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	     
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	     
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
	     Thread.sleep(1000);
	     
	     String searchFor="My Info";
	     WebElement element=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	     element.sendKeys(searchFor);
	     
	     Thread.sleep(1000);
	     
	    driver.findElement(By.linkText(searchFor)).click();
	     
	   
	}
	
	

}
