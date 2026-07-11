package com.automation.scripts;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CheckpointCheckLoginInvalid {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.manage().window().setSize(new Dimension(1920,1080));
	     
	     
	     
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	     driver.findElement(By.name("username")).sendKeys("admin123");
	     driver.findElement(By.name("password")).sendKeys("admin123");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
	    String alertmsg= driver.findElement(By.xpath("//div[@role='alert']")).getText();
	   
	    if(alertmsg.contentEquals("Invalid credentials")) {
	    	TakesScreenshot ts=(TakesScreenshot) driver;
	    	Thread.sleep(5000);
	    	File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	    	/*Manually also we can create Screenshot folder*/
	    //	File folder=new File("./Screenshots");
	    //	folder.mkdirs();
	    //	File destinationFile=new File(folder,"LoginFailure1.png");
	    	
	    	File destinationFile=new File("./Screenshots","LoginFailure1.png");
	    	Files.copy(sourceFile, destinationFile);
	    	System.out.println("Screenshot saved successfully");
	    	
	    	System.out.println("Login is UnSuccessful : Test Passed");
	    }else
	    		System.out.println("Login is Successful :Test Failed");
	    	
	    	driver.quit();
	    }
	}
	


