package com.automation.scripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     driver.manage().window().maximize();
		     
		     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		     
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     
		     String coursename="Learn JMETER from Scratch - (Performance + Load) Testing Tool";
		     
		     WebElement mytable=driver.findElement(By.xpath("//table[@id='product' and @name='courses']"));
		     
		     List<WebElement> all_rows=mytable.findElements(By.tagName("tr"));
		     
		     int total_rows=all_rows.size();
		    
		     
		     for(int i=1;i<total_rows;i++)
		     {
		    	 List<WebElement> all_columns=all_rows.get(i).findElements(By.tagName("td"));
		    	 	 
		    		  String name=all_columns.get(1).getText(); 		    		   
		    		  boolean compare= name.contentEquals(coursename);
		    		  
		    		  if(compare==true) {
		    			 
		    		 
		    		  String price=all_columns.get(2).getText();
		    		  System.out.println(name);
		    		  System.out.println("Price=" +price);
		    		  break;
		    			   
		    		 }
		    		  
			
		    	 }
	
		    // driver.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
		     
		     
		    		 
		    
		    
		  /*  WebElement Category= driver.findElement(By.id("dropdown-class-example"));
			Select Cat=new Select(Category);
			    
			Cat.selectByVisibleText("Option2");
			
			driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();*/
			
		//	driver.close();
		
	}

}
