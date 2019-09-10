package com.assess.setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {
	
	private  WebDriver driver;
	
	public  WebDriver getDriver() {
		return driver;
	}

	public void initilaize(String browser) {
		
		String path="src\\test\\java\\drivers\\";
		switch (browser) {
		case "FF":
			System.setProperty("webdriver.gecko.driver",path+"geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver",path+"chromedriver.exe"); 
			driver = new ChromeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver",path+"IEDriverServer.exe"); 
			driver = new InternetExplorerDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver",path+"chromedriver.exe"); 
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}	
}
