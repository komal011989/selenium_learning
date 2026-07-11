package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckpointCheckValidLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	     driver.findElement(By.name("username")).sendKeys("admin");
	     driver.findElement(By.name("password")).sendKeys("admin123");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
	     int foundDashboard = driver.findElements(By.xpath("//h6[text()='Dashboard']")).size();
	     int foundLoginButton=driver.findElements(By.xpath("//button[@type='submit']")).size();
	     
	     
	     if(foundDashboard == 1 && foundLoginButton==0){
	    	 System.out.println("Login is Successful, Test Passed");
	    	 
	     }else
	    	 System.out.println("Login is not Successfull, Test Failed");
	    
	 /*   String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"; 
	    String url=driver.getCurrentUrl();
        
	    if(expectedurl.contentEquals(url)) {
	    	System.out.println("Login Successful: Test Passed");
	    }else
	    	System.out.println("Login Unsuccessful: Test Failed");*/
	    
	    	
	    }
	
}
	    		 
	    		 


