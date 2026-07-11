package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	     
	     
	     driver.get("https://demo.automationtesting.in/Frames.html");
	     
	     WebElement button1=driver.findElement(By.xpath("//a[@href='#Single']"));
	      
	     button1.click();
	     
	     System.out.println("");
	     
	     //Switch to Frame
	     
	    // driver.switchTo().frame(0);
	 //    driver.switchTo().frame("SingleFrame");
	   //  driver.switchTo().frame("singleFrame");
	    
	   
	     
	     
	   WebElement f= driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	     
	    driver.switchTo().frame(f);
	     
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	     
	 
	     driver.switchTo().parentFrame();
	     //driver.switchTo().defaultContent();
	     
	     driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
	     

	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Iframe");
	   
	   
	}
	

}
