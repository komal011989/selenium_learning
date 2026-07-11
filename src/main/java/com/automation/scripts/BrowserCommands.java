package com.automation.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	 WebDriver driver = new ChromeDriver();
	 
	 
	 //Maximize the window
	 driver.manage().window().maximize();
	 
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	 System.out.println("First Current URL:" + driver.getCurrentUrl());
	 System.out.println("First Page Title" + driver.getTitle());
	 
	 Thread.sleep(2000);
	 
	 //Minimize the window
	 driver.manage().window().minimize();
	 
	 Thread.sleep(2000);
	 
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 
	 //Another way to open browser
	 driver.navigate().to("https://www.google.co.in/");
	 
	 System.out.println("Second Current URL :" + driver.getCurrentUrl());
	 System.out.println("Second Page Title:" +driver.getTitle());
	 Thread.sleep(2000);
	 
	 //click on back arrow
	 driver.navigate().back();
	 Thread.sleep(2000);
	 
	 //click in forward arrow
	 driver.navigate().forward();
	 Thread.sleep(2000);
	 
	 
	 //Refresh page
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	
	 
	 //close Browser
	 System.out.println("Driver before close is "+driver);
	 driver.quit();
	 
	 System.out.println("Driver after close is "+driver);
	

	}

}
