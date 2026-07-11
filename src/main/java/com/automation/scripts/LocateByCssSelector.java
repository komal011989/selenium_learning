package com.automation.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     WebDriver driver=new ChromeDriver();
		
     driver.manage().window().maximize();
     driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Komal");
     
     
     driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Kokane");
     
    //^ begining with 
     driver.findElement(By.cssSelector("input[type^='em']")).sendKeys("kokanekomal44@gmail.com");
     
     //$ ends with
     driver.findElement(By.cssSelector("input[type$='el']")).sendKeys("999999999");
     
     //* contains
     driver.findElement(By.cssSelector("input[name*='sswo']")).sendKeys("komal");
     
     //* contains
     driver.findElement(By.cssSelector("input[name*='firm']")).sendKeys("komal");
     
     // multiple attributes using and in css it is used with square bracket
     driver.findElement(By.cssSelector("input[name = 'newsletter'][value='1']")).click();
     
     driver.findElement(By.cssSelector("input[name='agree'][value='1']")).click();
     driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}

}
