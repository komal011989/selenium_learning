package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckpointAddEmployee {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	     driver.findElement(By.name("username")).sendKeys("admin");
	     driver.findElement(By.name("password")).sendKeys("admin123");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	      driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	      
	      String empFirstName="Komal";
	      String empLastName="Kokane";
	      String empMiddleName="KK";
	      
	      String expectedresult=empFirstName+" "+empLastName;
	      
	      driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(empFirstName);
	      driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(empMiddleName);
	      driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(empLastName);
	      
	      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	      wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("oxd-form-loader")));
	      
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	          
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-edit-employee-name']/h6")));
	      Thread.sleep(3000);
	      
	      String actualresult=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 --strong']")).getText();
	      
	      System.out.println("Actual Result=" +actualresult);
	      System.out.print("Expected Result="+expectedresult);
	      
	      if(actualresult.contentEquals(expectedresult)) {
	    	  System.out.println("Employee added successfull.. Test passesd");
	      }else
	    	  System.out.println("Employee not added...Test Failed");
	      }
	      
	
	}
	


