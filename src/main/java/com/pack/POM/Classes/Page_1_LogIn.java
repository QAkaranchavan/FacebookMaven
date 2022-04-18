package com.pack.POM.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_1_LogIn 
{
	// 1. Declaration
	WebDriver driver;
	
	// 2.Finding WebElements
	@FindBy(xpath="//form//div[5]//a")
	private WebElement CreateNewUser;
	
	// 3. Making Constructor of Class
	public Page_1_LogIn(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	// 4.Performing Action on WebElememt
	public void clickonCreate()
	{
		CreateNewUser.click();
	}

}
