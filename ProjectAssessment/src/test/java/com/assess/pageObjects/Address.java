package com.assess.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Address {
	private WebDriver driver;
	private By proceedAddress=By.cssSelector("button[name='processAddress']");
	
	public Address(WebDriver driver)
	{
		this.driver=driver;
	}

	public Shipping clickOnProceedToCheckOut()
	{
		driver.findElement(proceedAddress).click();
		return new Shipping(driver);	
	}
}
