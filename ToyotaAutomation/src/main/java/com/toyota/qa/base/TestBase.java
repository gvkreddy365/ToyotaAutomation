package com.toyota.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.toyota.qa.util.TestUtil;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/gvijaykumarreddy/Desktop/Selenium Practice/OfficeworksPOM/ToyotaAutomation/src/main/java/com/"
					+ "toyota/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e)
				{
			e.printStackTrace();
				} catch (IOException e) 
				{
			e.printStackTrace();
				}
	}


public static void initialization()
{
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","/Users/gvijaykumarreddy/Desktop/Learning from Dec 2018/chromedriver");
		driver = new ChromeDriver();
	}
	else if(browserName.equals("ff"))
	{
		System.setProperty("webdriver.gecko.driver","/Users/gvijaykumarreddy/Desktop/Learning from Dec 2018/geckodriver");
		driver = new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
}
}
