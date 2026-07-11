package com.automation.scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class LaunchChrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver object
		WebDriver driver = new ChromeDriver(); 
		
		//open page
		driver.get("https://www.amazon.in/");
		
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
