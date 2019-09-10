package com.assess.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shipping {
	
	private WebDriver driver;
	
	private By proceedShipping=By.cssSelector("button[name='processCarrier']");
	private By errorMsg=By.cssSelector("p[class='fancybox-error']");
	private By clickCross=By.cssSelector("a[class='fancybox-item fancybox-close']");
	private By checkBox=By.id("cgv");
	
	public Shipping(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean isErrorMessageDisplayed()
	{
		driver.findElement(proceedShipping).click();
		return driver.findElement(errorMsg).isDisplayed();
	}
	
	public Payment clickCheckBoxAndProceedToCheckOut() throws InterruptedException
	{
		driver.findElement(clickCross).click();
		Thread.sleep(1000);
		driver.findElement(checkBox).click();
		Thread.sleep(1000);
		driver.findElement(proceedShipping).click();
		return new Payment(driver); 
	}

}
