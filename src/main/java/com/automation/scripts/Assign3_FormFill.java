package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign3_FormFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		     driver.manage().window().maximize();
		     
		     driver.get("https://demo.automationtesting.in/Register.html");
		     
		     //First Name
		     driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Komal");
		     
		     
		     //Last Name
		     driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kokane");
		     
		     //Address
		     driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Rahatani,Pimpri Pune");
		     
		     
		     //Email Id
		     driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kokanekomal44@gmail.com");
		     
		     
		     //Contact No
		     driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9999999999");
		     
		     //Gender
		     driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		     
		     
		     //Hobbies
		     driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		  
		 
				   driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']/following::a[text()='English']"));
			/*	 WebElement Language=  driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
		         
				 
		    Select Lang=new Select(Language);
		     
		    Lang.selectByVisibleText("English");*/
		   
		     
		     //Select Skills
		     WebElement Category= driver.findElement(By.xpath("//select[@id='Skills']"));
			    Select Cat=new Select(Category);
			    
			    Cat.selectByVisibleText("Java");
		    
		
			    
			  WebElement c=  driver.findElement(By.xpath("//select[@id='countries']"));
			  Select cnt=new Select(c);
			  
			  cnt.selectByVisibleText("Select Country");
			  
		   
			  //Select Country
			    WebElement Country=driver.findElement(By.xpath("//select[@id='country']"));
			      
			      Select cntry=new Select(Country);
			      
			      cntry.selectByVisibleText("India");
				   
				
	
		        //Select year
			    WebElement Year=  driver.findElement(By.xpath("//select[@id='yearbox']"));
			    
			    Select yr=new Select(Year);
			    
			    yr.selectByVisibleText("1989");
			    
			    
		     
			    //Select Month
			    WebElement Month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
			    
			    Select Mnth=new Select(Month);
			    
			    Mnth.selectByValue("June");
			    
			  //Select Day      
			    WebElement Day=driver.findElement(By.xpath("//select[@placeholder='Day']"));
			    Select dy=new Select(Day);
			    
			    dy.selectByValue("1");
			    
			   
		     //Password
		     driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Komal");
		     
		     //Confirm Password
		     driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Komal");
		     
		     
		     //Click Submit
		     driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
     
		     
		     
	}

}
