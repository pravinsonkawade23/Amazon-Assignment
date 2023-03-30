package com.ama.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	WebDriver driver;
	@FindBy(xpath = "//input[@id='add-to-cart-button']") private WebElement addToCartButton;
	@FindBy(xpath = "//span[@class='a-button a-button-base abb-intl-decline']") private WebElement decline;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void toAddinCart() throws InterruptedException
	{
		addToCartButton.click();
		Thread.sleep(3000);
	}
	
	public void handleSuggestionPopup() throws InterruptedException
	{
		try {
		decline.click();		
		}
		catch(Exception e)
		{
			System.out.println("Suggestion pop-up is not there");
		}
		Thread.sleep(2000);
	}
	
}
