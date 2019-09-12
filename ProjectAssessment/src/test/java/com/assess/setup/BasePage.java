package com.assess.setup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.assess.manager.FileReaderManager;

public class BasePage {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public void initilaize(String browser) throws IOException {
		switch (browser) {
		case "FF":
			System.setProperty("webdriver.gecko.driver",FileReaderManager.getInstance().getConfigReader().getDriverPath()+"geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver",FileReaderManager.getInstance().getConfigReader().getDriverPath()+"chromedriver.exe"); 
			driver = new ChromeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver",FileReaderManager.getInstance().getConfigReader().getDriverPath()+"IEDriverServer.exe"); 
			driver = new InternetExplorerDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver",FileReaderManager.getInstance().getConfigReader().getDriverPath()+"chromedriver.exe"); 
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitWait(), TimeUnit.SECONDS);
	}	
}
