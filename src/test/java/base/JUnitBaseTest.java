package base;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JUnitBaseTest {

protected WebDriver driver;
	
	protected Properties p;
	
	@BeforeEach
	public void setup() throws IOException
	{
	
	p=new Properties();
	p.load(getClass().getClassLoader().getResourceAsStream("config.properties"));

//	driver=new FirefoxDriver();
	
	String browser=p.getProperty("browser");
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
    driver.get(p.getProperty("url"));
}
	
	@AfterEach
	public void closeBrowser()
	{
	  driver.quit();	
	}
}
