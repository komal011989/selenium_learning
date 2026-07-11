package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     driver.manage().window().maximize();
		     
		     driver.get("https://demoqa.com/alerts");
		     
		     driver.findElement(By.id("alertButton")).click();
		     Thread.sleep(2000);
		     
	         Alert alt=driver.switchTo().alert();
	         
	         String expectedmsg="You clicked a button";
	         
	         String actualmsg=alt.getText();
	         
	         System.out.println("Alert message is:"+ actualmsg);
	         
	         if(expectedmsg.contentEquals(actualmsg)) {
	        	 System.out.println("Alert Message Correct...Test Passed");
	         }
	        	 else {
	        		 System.out.println("Alert message Incorrect...Test Failed");
	         }
	          
	         alt.accept();
	         
	         
	         driver.findElement(By.id("confirmButton")).click();
	         
	         Thread.sleep(5000);
	         alt= driver.switchTo().alert();
	         
	         alt.dismiss();
	         
	         Thread.sleep(2000);
	         
	         driver.findElement(By.id("promtButton")).click();
	         
	         alt=driver.switchTo().alert();
	         Thread.sleep(2000);
	         
	         alt.sendKeys("Komal");
	         Thread.sleep(2000);
	         
	         alt.accept();
	         
	         
	}
	

}
