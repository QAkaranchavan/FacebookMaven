package com.pack.Test.Classes;

import org.testng.annotations.Test;

import com.pack.POM.Classes.Page_1_LogIn;
import com.pack.POM.Classes.Page_2_Create_New_Acc;

public class TC01_Page_1_Elements_validation extends BaseClass
{
	@Test
	public void New_User() throws InterruptedException
	{
		Page_1_LogIn li = new Page_1_LogIn(driver);
		li.clickonCreate();
		System.out.println("Step 03: Click on Create New User Button");
		log.info("Step 03: Click on Create New User Button");
		Thread.sleep(2000);
		
		
		Page_2_Create_New_Acc nu = new Page_2_Create_New_Acc(driver);
		nu.sendfn();
		System.out.println("Step 04: First Name Entered");
		log.info("Step 04: First Name Entered");
		
		nu.selectBDate();
		System.out.println("Step 05: Birth Date is Entered");
		log.info("Step 05: Birth Date is Entered");
		
		nu.selectBMonth();
		System.out.println("Step 06: Birth Month is Entered");
		log.info("Step 06: Birth Month is Entered");
		
		nu.selectBYear();
		System.out.println("Step 07: Birth Year is Entered");
		log.info("Step 07: Birth Year is Entered");
		
	}
	
	

}
