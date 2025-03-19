package com.ama.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass 
{
	public  WebDriver driver;
	
	@BeforeClass
	public void initializeBrowser()
	{
		driver = new Driver().getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(ConfigurationReader.getProperty("url"));		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
