package com.pack.Test.Classes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC02_NaukriTask 
{
	
	public static Logger log;
	@Test(timeOut = 50000)
	public void naukriT() throws InterruptedException
	{
		log = Logger.getLogger("1_Maven_Trail_V1");
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver_win32\\v ChromeDriver 101.0.4951.41\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver	= 	new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Test Step 1: URL Opened");
		log.info("Test Step 1: URL Opened");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		System.out.println("Test Step 2: Login Button finded and Clicked");
		log.info("Test Step 2: Login Button finded and Clicked");
		driver.findElement(By.xpath("(//form//div//input)[1]")).sendKeys("karansc17@gmail.com");
		System.out.println("Test Step 3: Username textbox finded and Entered");
		log.info("Test Step 3: Username textbox finded and Entered");
		driver.findElement(By.xpath("(//form//div//input)[2]")).sendKeys("Karan@2601");
		System.out.println("Test Step 4: Password textbox finded and Entered");
		log.info("Test Step 4: Password textbox finded and Entered");
		driver.findElement(By.xpath("(//form//div//button)[1]")).click();
		System.out.println("Test Step 5: Login Button finded and Clicked");
		log.info("Test Step 5: Login Button finded and Clicked");
		WebElement My = driver.findElement(By.xpath("//div[text()='My Naukri']"));
		Actions act = new Actions(driver);
		act.moveToElement(My).perform();
		System.out.println("Test Step 6: Take mause to My Naukri");
		log.info("Test Step 6: Take mause to My Naukri");
		driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();
		System.out.println("Test Step 7: Edit profile Button finded and Clicked");
		log.info("Test Step 7: Edit profile Button finded and Clicked");
		Thread.sleep(2000);
		WebElement EditResumeHeadlineButton = driver.findElement(By.xpath("(//span[text()='Edit'])[2]"));
		EditResumeHeadlineButton.click();
		System.out.println("Test Step 8: Edit Button finded and Clicked");
		log.info("Test Step 8: Edit Button finded and Clicked");
		
		WebElement t = driver.findElement(By.xpath("//form//div//div//textarea"));
		t.clear();
		System.out.println("Test Step 9: textbox cleared");
		log.info("Test Step 9: textbox cleared");
		Thread.sleep(2000);
		t.sendKeys("Immediate joiner\r\n"
				+ "QA Automation Engineer Having 3 Years of Experience in Manual Testing,Automation Testing in JAVA with Selenium WebDriver,UI,API Testing with POSTMAN & SQL.Good with Hybrid framework,POM,TestNG,JIRA,GitHub,OOPs,UNIX,Agile environment");
		
		System.out.println("Test Step 10: Data Entered");
		log.info("Test Step 10: Data Entered");
		Thread.sleep(2000);
		WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
		Thread.sleep(2000);
		save.click();
		System.out.println("Test Step 11: Clicked on save button");
		log.info("Test Step 11: Clicked on save button");
		Thread.sleep(2000);
		EditResumeHeadlineButton.click();	
		
		try
		{
			t.clear();
			System.out.println("Test Step 12:try textbox cleared");
			log.info("Test Step 12:try textbox cleared");
			
		}catch(StaleElementReferenceException e)
		{
			
			t = driver.findElement(By.xpath("//form//div//div//textarea"));
			t.clear();
			System.out.println("Test Step 13:catch textbox cleared");
			log.info("Test Step 13:catch textbox cleared");
		}
		Thread.sleep(2000);
		t.sendKeys("Immediate joiner\r\n"
				+ "QA Automation Engineer Having 3 Years of Experience in Manual Testing,Automation Testing in JAVA with Selenium WebDriver,UI,API Testing with POSTMAN & SQL.Good with Hybrid framework,POM,TestNG,JIRA,GitHub,OOPs,UNIX,Agile environment.");
		System.out.println("Test Step 14: data reEntered");
		log.info("Test Step 14: data reEntered");
		try
		{
			save.click();
			System.out.println("Test Step 15: try Save button");
			log.info("Test Step 15: try Save button");
		}catch(StaleElementReferenceException e)
		{
			save = driver.findElement(By.xpath("//button[text()='Save']"));
			save.click();
			System.out.println("Test Step 14: catch Save button");
			log.info("Test Step 14: catch Save button");
		}
		
		
		driver.close();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
