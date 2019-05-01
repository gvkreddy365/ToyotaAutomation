package com.toyota.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.toyota.qa.base.TestBase;
public class HomePage extends TestBase{

	
	@FindBy(xpath="//a[contains(text(),'Find a Lexus Dealer')]")
	WebElement findadealer;
	
	//Initializing the page objects
		public HomePage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle()
		{
			return driver.getTitle();
		}
		
		public FindADealerPage clickonfindadealer()
		{
			findadealer.click();
			return new FindADealerPage();
		}

}
