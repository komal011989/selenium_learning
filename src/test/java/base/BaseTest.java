package base;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	protected WebDriver driver;
	
	protected Properties p;
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browser) throws IOException
	{
	
	p=new Properties();
	p.load(getClass().getClassLoader().getResourceAsStream("config.properties"));

//	driver=new FirefoxDriver();
	
	//String browser=p.getProperty("browser");
	if(browser.equalsIgnoreCase("chrome"))
	{
		ChromeOptions options=new ChromeOptions();
		driver = new RemoteWebDriver(new URL(p.getProperty("gridURL")),options);

	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		FirefoxOptions options=new FirefoxOptions();
		driver = new RemoteWebDriver(new URL(p.getProperty("gridURL")),options);
			
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		EdgeOptions options=new EdgeOptions();
		driver = new RemoteWebDriver(new URL(p.getProperty("gridURL")),options);
	}
	
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    driver.get(p.getProperty("url"));
}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
	 
	  Thread.sleep(15000);
	  driver.quit();	
	}

}