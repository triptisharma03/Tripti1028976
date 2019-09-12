package com.assess.dataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	 private Properties properties;
	 private final String propertyFilePath= "config//Configuration.properties";
	 
	 public ConfigFileReader() throws IOException
	 {
		 BufferedReader reader;
		 reader = new BufferedReader(new FileReader(propertyFilePath));
		 properties = new Properties();
		 properties.load(reader);
		 reader.close();
	}
	 public String getDriverPath()
	 {
		 String driverPath = properties.getProperty("driverPath");
		 if(driverPath!= null) 
			 return driverPath;
		 else 
			 throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
	}
		 
	public long getImplicitWait()
	{ 
		 String implicitWait = properties.getProperty("implicitWait");
		 if(implicitWait != null) 
			 return Long.parseLong(implicitWait);
		 else 
			 throw new RuntimeException("implicitWait not specified in the Configuration.properties file."); 
	}
		 
	public String getUrl()
	{
		 String url = properties.getProperty("url");
		 if(url != null) 
			 return url;
		 else 
			 throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public String getBrowser()
	{
		 String browser = properties.getProperty("browser");
		 if(browser != null) 
			 return browser;
		 else 
			 throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}
}
