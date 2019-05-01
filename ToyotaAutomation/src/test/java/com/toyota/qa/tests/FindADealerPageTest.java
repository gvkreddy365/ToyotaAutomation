package com.toyota.qa.tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.toyota.qa.base.TestBase;
import com.toyota.qa.pages.FindADealerPage;
import com.toyota.qa.pages.HomePage;

public class FindADealerPageTest extends TestBase{

	HomePage homepage;
	FindADealerPage findadealerpage;
	
	public FindADealerPageTest()
	{
		super();
	}
	
	//initializes the setup from test base class
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homepage=new HomePage();
		findadealerpage = new FindADealerPage();
		findadealerpage=homepage.clickonfindadealer();
	}
	
	//Test to validate the find a dealer page title
	@Test(priority=1)
	public void verifyfindadealerpageTitleTest()
	{
	String loginpagetitle = findadealerpage.verifyfindadealerpageTitle();
	Assert.assertEquals(loginpagetitle, "Lexus Australia | Find a Dealer | Lexus", "Dealer Page Title is not matched");
	}
	
	@Test(priority=2)
	public void findadealerTest()
	{
		String dealertext = findadealerpage.clickonfindadealer();
		Assert.assertEquals(dealertext, "559 Elizabeth Street\nMELBOURNE VIC, 3000", " Dealer text is not matched");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
