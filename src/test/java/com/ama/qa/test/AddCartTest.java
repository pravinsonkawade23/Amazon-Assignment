package com.ama.qa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ama.qa.base.BaseClass;
import com.ama.qa.base.ConfigurationReader;
import com.ama.qa.pages.CartPage;
import com.ama.qa.pages.LoginPage;
import com.ama.qa.pages.MainPage;
import com.ama.qa.pages.ProductPage;

public class AddCartTest extends BaseClass
{
	LoginPage loginPage;
	MainPage mainPage;
	CartPage cartPage;
	ProductPage productPage;
	
	@BeforeClass
	public void intialize()
	{
		loginPage= new LoginPage(driver);
		mainPage= new MainPage(driver);
		cartPage= new CartPage(driver);
		productPage= new ProductPage(driver);
	}
	
	@Test
	public void addProductToCart() throws InterruptedException
	{
		loginPage.login(ConfigurationReader.getProperty("Username"), ConfigurationReader.getProperty("Password"));		
		mainPage.clickonAllMenu();
		mainPage.clickonAlexa();
		mainPage.clickonEcho();
		productPage.toAddinCart();
		productPage.handleSuggestionPopup();
		Assert.assertEquals(cartPage.getMessage().trim(), "Added to Cart");
		cartPage.signingOut();
	}	

}
