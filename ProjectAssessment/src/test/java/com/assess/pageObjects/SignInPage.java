package com.assess.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

	private WebDriver driver;
	
	private By tshirt=By.xpath("//div[@id='block_top_menu']/ul/li[3]/a");
	private By clickSignIn=By.cssSelector("a[class='login']");
	private By emailId=By.id("email");
	private By password=By.id("passwd");
	private By submit=By.id("SubmitLogin");
	
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public Tshirt clickTshirt()
	{
		driver.findElement(tshirt).click();
		return new Tshirt(driver);
	}
	
	public void clickSignIn()
	{
		driver.findElement(clickSignIn).click();
	}
	
	public MyAccount signIn(String email,String passwrd)
	{
		driver.findElement(emailId).sendKeys(email);
		driver.findElement(password).sendKeys(passwrd);
		driver.findElement(submit).click();
		return new MyAccount(driver);
	}
		
}
