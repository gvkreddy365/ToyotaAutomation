package com.toyota.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toyota.qa.base.TestBase;

public class FindADealerPage extends TestBase {

	@FindBy(xpath="//span[contains(text(),'Enter postcode or suburb')]")
	WebElement searchdealer;
	
	@FindBy(xpath="//span[contains(text(),'HOPPERS CROSSING')]")
	WebElement hoppers;
	
	@FindBy(xpath="//span[contains(text(),'559 Elizabeth Street')]")
	WebElement dealer1;
	
	//Initializing the page objects
	public FindADealerPage()
	{
	PageFactory.initElements(driver, this);
	}
			
	public String verifyfindadealerpageTitle()
	{
		return driver.getTitle();
	}	
	
	public String clickonfindadealer()
	{
		searchdealer.click();
		searchdealer.sendKeys("3029");
		hoppers.click();
		return dealer1.getText();
	}
}
