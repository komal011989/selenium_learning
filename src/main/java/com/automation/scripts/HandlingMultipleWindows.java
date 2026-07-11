package com.automation.scripts;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	     String parentWindow= driver.getWindowHandle();
	     
	     driver.get("https://demo.automationtesting.in/Windows.html");
	     
	     driver.findElement(By.xpath("//button[text()='    click   ']")).click();
	     
	     Thread.sleep(1000);
	     
	     //Cant directly access elements on the newlu=y opened page
	     //driver.findElement(By.xpath("//a[text()='Register now!'])")).click();
	     
	     //to Handle Multiple windows : 'handle' is a set of Windows handles
	     
	     Set <String> handle=driver.getWindowHandles();
	     
	     //This is a For Each Loop(enhanced for loop)
	     //this loop is mainly used to retrieving the elements in array and collection
	     
	     for(String h: handle)
	     {
	    	 System.out.println(h);
	    	 //Switch the window
	    	 String pageTitle=driver.switchTo().window(h).getTitle();
	    	 System.out.println(pageTitle);
	    	 
	    	 if(pageTitle.contentEquals("Selenium"))
	    	 {
	    		 driver.findElement(By.linkText("Register now!")).click();
	    			    	 
	    	 }
	     }
	    Thread.sleep(5000); 
	    
	    driver.switchTo().window(parentWindow);
	    
	    driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
	    
	    handle=driver.getWindowHandles();
	    
	    for(String h:handle)
	    {
	    	System.out.print(h);
	    	String pageTitle=driver.switchTo().window(h).getTitle();
	    	System.out.println(pageTitle);
	    	 
	    	 if(pageTitle.contentEquals("Selenium"))
	    	 {
	    		 driver.findElement(By.linkText("Register now!")).click();
	    			    	 
	    	 }
	     
	    	
	    }
	    
	    Thread.sleep(3000);
	    	 }
	     
	     
	     
	}


