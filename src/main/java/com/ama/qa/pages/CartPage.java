package com.ama.qa.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage 
{
	Actions act;
	WebDriver driver;
	@FindBy(xpath = "//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']") private WebElement actualMessage;
	@FindBy(xpath = "//a[@id='nav-link-accountList']") private WebElement signOut;
	@FindBy(xpath = "//a[@id='nav-item-signout']") private WebElement signOutButton;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public String getMessage()
	{
		return actualMessage.getText();		
	}
	
	public void signingOut()
	{		
		act= new Actions(driver);
		act.moveToElement(signOut).perform();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(signOut));
		signOutButton.click();
	}

}
