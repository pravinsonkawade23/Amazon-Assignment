package com.ama.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage 
{
	WebDriver driver;
	Actions act;
	@FindBy(xpath = "(//div[@class='nav-left'])[3]") private WebElement allMenu;
	@FindBy(linkText = "Echo & Alexa") private WebElement alexa;
	@FindBy(linkText = "All-new Echo Dot (4th Gen)") private WebElement echo;
	
	public MainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickonAllMenu()
	{
		allMenu.click();
	}
	
	public void clickonAlexa()
	{
		alexa.click();
	}
	
	public void clickonEcho()
	{
		echo.click();
	}
	
}
