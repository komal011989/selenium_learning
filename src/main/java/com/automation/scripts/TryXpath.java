package com.automation.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
	     driver.manage().window().maximize();
	     driver.get("https://demoqa.com/webtables");
	     
	  WebElement e= driver.findElement(By.xpath("//td[text()='Cierra']/parent::tr/td[5]"));
	  System.out.println(e.getText());
	  
	  driver.quit();
	    		 
	}

}
