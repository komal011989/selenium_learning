package com.automation.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver object
		WebDriver driver = new FirefoxDriver(); 
		
		//open page
		driver.get("https://www.google.com/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("Page Title: " +driver.getTitle());
		
		//close page
		driver.quit();

	}

}
