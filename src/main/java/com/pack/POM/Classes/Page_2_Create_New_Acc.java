package com.pack.POM.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_2_Create_New_Acc 
{
	// 1. 
	WebDriver driver;
	Select sel;
	// 2.
	@FindBy(xpath="(//div[1]//div//input)[9]")
	private WebElement fn;
	
	@FindBy(xpath="(//div[1]//div//input)[10]")
	private WebElement sn;
	
	@FindBy(xpath="(//div[1]//div//input)[11]")
	private WebElement mn;
	
	@FindBy(xpath="(//div[1]//div//input)[13]")
	private WebElement ps;
	
	@FindBy(xpath="(//div//span//select)[1]")
	private WebElement dobdate;
	
	@FindBy(xpath="(//div//span//select)[2]")
	private WebElement dobmonth;
	
	@FindBy(xpath="(//div//span//select)[3]")
	private WebElement dobyear;
	
	@FindBy(xpath="(//div[1]//div//input)[17]")
	private WebElement gender;
	
	@FindBy(xpath="(//div//button)[2]")
	private WebElement signupBut;
	

	
	// 3.
	public Page_2_Create_New_Acc(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	// 4.
	
	
	public void sendfn()
	{
		fn.sendKeys("varun");
	}
	
	public void selectBDate()
	{
		sel = new Select(dobdate);
		sel.selectByIndex(25);
	}
	
	public void selectBMonth()
	{
		sel=new Select(dobmonth);
		sel.selectByIndex(0);
	}
	
	public void selectBYear()
	{
		sel = new Select(dobyear);
		sel.selectByIndex(25);
		
	}

}
