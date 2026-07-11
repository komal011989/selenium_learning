package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckpointCheckTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	     String expectedTitle="OrangeHRM";
	     String actualTitle=driver.getTitle();
	     
	     System.out.println("Actual Title is: "+actualTitle);
	     
	     if(actualTitle.contentEquals(expectedTitle)) {
	    	 System.out.print("Title same....Test passed");
	     }
	     else
	     {
	    	 System.out.print("Title not same....Test Failed");
	     }
	     
	     driver.quit();
	     }
	    	 

	}


