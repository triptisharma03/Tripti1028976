package com.assess.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment {
	private WebDriver driver;
	
	private By bankWire=By.cssSelector("a[class='bankwire']");
	private By confirmOrder=By.xpath("//p[@id='cart_navigation']/button");
	private By backToOrders=By.cssSelector("a[title='Back to orders']");
	
	public Payment(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickPayByBankWire()
	{
		driver.findElement(bankWire).click();
	}
	
	public void clickConfirmOrder()
	{
		driver.findElement(confirmOrder).click();
	}
	
	public OrderHistory clickBackToOrders()
	{
		driver.findElement(backToOrders).click();
		return new OrderHistory(driver); 
	}
}
