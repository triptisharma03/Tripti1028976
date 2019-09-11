package com.assess.stepDefinition;

import org.openqa.selenium.WebDriver;
import com.assess.setup.BasePage;

public class CommonStepDef {
	
	public WebDriver getWebdriver(){
		return BasePage.getDriver();
	}
}

