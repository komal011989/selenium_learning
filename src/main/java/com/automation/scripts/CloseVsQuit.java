package com.automation.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Opens a URL in browser window
		driver.get("https:www.amazon.com/");
		Thread.sleep(2000);
		
		//opens New TAB in browser
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		//second Tab
		driver.get("https://www.google.com/");
		
		
		
		System.out.println("Driver before is: "+driver);

		//driver.close();//close only current browser window
		driver.quit();//closes the entire session
		
		System.out.println("Driver after is: "+driver);
		
		
	
		
		
	}

}
