package com.assess.pageObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistory {
	
	private WebDriver driver;
	
	private By orderReference=By.xpath("//table[@id='order-list']/tbody/tr[1]/td[1]/a");
	private By orderedDate=By.xpath("//table[@id='order-list']/tbody/tr[1]/td[2]");
	private By totalPrice=By.xpath("//table[@id='order-list']/tbody/tr[1]/td[3]/span");
	private By payMethod=By.xpath("//table[@id='order-list']/tbody/tr[1]/td[4]");
	
	public OrderHistory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean isOrderReferenceDisplayed()
	{
		return driver.findElement(orderReference).isDisplayed();
	}
	
	public boolean isDatePriceAndPaymentMethodDisplayed()
	{
		String orderDate=driver.findElement(orderedDate).getText();
		LocalDate dateLocal=LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formatttedDate=dateLocal.format(formatter);
		Boolean price=driver.findElement(totalPrice).isDisplayed();
		Boolean paymentMethod=driver.findElement(payMethod).isDisplayed();
		if(orderDate.equals(formatttedDate) && price && paymentMethod)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
