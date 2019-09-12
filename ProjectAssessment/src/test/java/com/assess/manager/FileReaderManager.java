package com.assess.manager;

import java.io.IOException;

import com.assess.dataProvider.ConfigFileReader;

public class FileReaderManager {
	 private static FileReaderManager fileReaderManager = new FileReaderManager();
	 private static ConfigFileReader configFileReader;
	 public static FileReaderManager getInstance( ) {
	       return fileReaderManager;
	 }
	 public ConfigFileReader getConfigReader() throws IOException {
		 if(configFileReader == null)
			 return new ConfigFileReader();
		 else
			 return configFileReader;
		 }
}
