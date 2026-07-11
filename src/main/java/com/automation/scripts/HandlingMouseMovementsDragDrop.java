package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseMovementsDragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     
	     driver.get("https://jqueryui.com/droppable");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
         Actions act=new Actions(driver);
         
         WebElement frame1=driver.findElement(By.className("demo-frame"));
         
         driver.switchTo().frame(frame1);
         
         Thread.sleep(2000);
         
         WebElement from_drop=driver.findElement(By.id("draggable"));
         
         Thread.sleep(2000);
         
         WebElement to_drop=driver.findElement(By.id("droppable"));
         
         
       /*  act.clickAndHold(from_drop).build().perform();
         act.moveToElement(to_drop).build().perform();
         act.release(to_drop).build().perform();*/
         
         
         //Single method to perform drag and drop action
        act.dragAndDrop(from_drop, to_drop).build().perform();
         
         driver.quit();
         
         
	
	}

}
