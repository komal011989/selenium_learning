package com.automation.scripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     
	     WebElement mytable=driver.findElement(By.xpath("//table[@id='product' and @name='courses']"));
	     
	     List<WebElement> all_rows=mytable.findElements(By.tagName("tr"));
	     
	     int total_rows=all_rows.size();
	     
	     for(int i=1;i<total_rows;i++)
	     {
	    	 List<WebElement> all_columns=all_rows.get(i).findElements(By.tagName("td"));
	    	 
	    	 int total_columns=all_columns.size();
	    	 
	    	 for(int j=0;j<total_columns;j++)
	    	 {
	    		 System.out.println(all_columns.get(j).getText());
	    	 }
	    	 
	    	 }
	    	 
	     }
	}


