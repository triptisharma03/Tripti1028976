package com.assess.stepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.assess.manager.FileReaderManager;
import com.assess.setup.BasePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage{
	private  WebDriver driver;
	
	@Before("@firstTest,@secondTest")  //opens the browser
    public void setUp() throws IOException {
		initilaize(FileReaderManager.getInstance().getConfigReader().getBrowser());
		driver = getDriver();
    }	

	@After("@firstTest,@secondTest") //closes the browser
    public void tearDown() {
        driver.quit();
    }
}
