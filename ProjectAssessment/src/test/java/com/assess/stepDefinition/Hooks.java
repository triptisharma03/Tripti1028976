package com.assess.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.assess.setup.BasePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage{
	private  WebDriver driver;
	String browser="chrome";
	
	@Before("@firstTest,@secondTest")  //opens the browser
    public void setUp() {
		initilaize(browser);
		driver = getDriver();
    }	

	@After("@firstTest,@secondTest") //closes the browser
    public void tearDown() {
        driver.quit();
    }
}
