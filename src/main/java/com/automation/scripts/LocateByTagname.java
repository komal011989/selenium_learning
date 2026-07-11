package com.automation.scripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocateByTagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.amazon.in/");
	     
	     String expectedLink="Mobiles";
	     
	     List <WebElement> allLinks=driver.findElements(By.tagName("a"));
	     
	     for (WebElement we:allLinks)
	     {
	    	 System.out.println(we.getText());
	    	
	    	 //if(expectedLink.equalsIgnoreCase(we.getText()))
	    	 //we.click();
	    	 
	     }
	     
	     driver.findElement(By.linkText(expectedLink)).click();
	    
	}

}
