package com.ama.qa.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	public WebDriver driver;
	public ChromeOptions options;
	
	public WebDriver getDriver() {
		String browser = ConfigurationReader.getProperty("browser");
		
		switch(browser.toLowerCase()) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		
		
		
		return driver;
	}
	
}
