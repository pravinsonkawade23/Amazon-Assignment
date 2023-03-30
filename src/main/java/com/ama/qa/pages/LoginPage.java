package com.ama.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	@FindBy(xpath = "//div[@class='nav-line-1-container']") private WebElement signIn;
	@FindBy(xpath = "//input[@id='ap_email']") private WebElement userNameField;
	@FindBy(xpath = "(//span[@class='a-button-inner'])[1]") private WebElement continueButton;
	@FindBy(xpath = "//input[@id='ap_password']") private WebElement passwordField;
	@FindBy(xpath = "//input[@id='signInSubmit']") private WebElement signInButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void login(String username, String password)
	{
		signIn.click();
		userNameField.sendKeys(username);
		continueButton.click();
		passwordField.sendKeys(password);
		signInButton.click();		
	}
	
	
}
