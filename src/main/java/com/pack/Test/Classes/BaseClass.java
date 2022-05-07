package com.pack.Test.Classes;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	WebDriver driver;
	public static Logger log;
	@BeforeMethod
	public void setup()
	{
		log = Logger.getLogger("1_Maven_Trail_V1");
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver_win32\\v ChromeDriver 101.0.4951.41\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Step 01: Browser Opened");
		log.info("Step 01: Browser Opened");
		driver.get("https://www.facebook.com/");
		System.out.println("Step 02: Browser Opened");
		log.info("Step 02: Browser closed");
	}

	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Step end: Browser Closed");
		log.info("Step end: Browser Closed");
		driver.close();
	}


}
