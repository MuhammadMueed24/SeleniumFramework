package com.project.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\Configurations\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getUrl() {

		return prop.getProperty("url");

	}

	public String getBrowser() {

		return prop.getProperty("browser");
	}
	
	public String getEmail() {
		return prop.getProperty("Email");
	}
	
	public String getPassword() {
		return prop.getProperty("Password");
	}

}
