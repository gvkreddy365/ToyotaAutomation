package com.toyota.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.toyota.qa.base.TestBase;
import com.toyota.qa.pages.HomePage;

public class HomePageTest extends TestBase{

	HomePage homepage;
	
	public HomePageTest()
	{
		super();
	}
	
	//initializes the setup from test base class
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homepage=new HomePage();
	}
	
	//Test to validate the home page title
	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
	String loginpagetitle = homepage.verifyHomePageTitle();
	Assert.assertEquals(loginpagetitle, "Welcome to the official Lexus Australia website | Lexus", "Home Page Title is not matched");
	}
	
	//Test to click on find a dealer option in home page
	@Test(priority=2)
	public void clickonfindadealerTest()
	{
		homepage.clickonfindadealer();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
