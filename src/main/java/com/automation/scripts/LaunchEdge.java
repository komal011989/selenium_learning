package com.automation.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       //create driver object
		        System.setProperty("SE_MSEDGEDRIVER_MIRROR_URL", "https://msedgedriver.microsoft.com");
				WebDriver driver = new EdgeDriver(); 
				
				//open page
				driver.get("https://www.google.com/");
				
		
				System.out.println("Page Title: " +driver.getTitle());
				
				//close page
				driver.quit();

	}

}
