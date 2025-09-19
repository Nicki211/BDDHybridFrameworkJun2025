package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Dell
 *
 */
public class ReadProperties {

	/**
	 * 
	 * @return
	 * This method will read the properties from config.properties file
	 * 
	 */
	public static Properties loadProperties() {
		// Open the File
		File objfile = new File("AppConfig/config.properties");
		// Read the File

		FileInputStream objfis = null;
		try {
			objfis = new FileInputStream(objfile);
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}

		Properties objprop = new Properties();
		try {
			objprop.load(objfis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return objprop;

	}

	/**
	 * 
	 * @return
	 * This method will read the appURL from config.properties file 
	 */
	public static String getappURL() {

		return loadProperties().getProperty("appURL");

	}

	/**
	 * 
	 * @return
	 * This method will read the implicitWaitTime from config.properties file 
	 */
	public static long implicitWaitTime() {

		return Long.parseLong(loadProperties().getProperty("implicitWaitTime"));
	}
	
	/**
	 * 
	 * @return
	 * This method will read the userName from config.properties file 
	 */

	public static String getAppUserName() {
		return loadProperties().getProperty("userName");
	}

	/**
	 * 
	 * @return
	 * This method will read the password from config.properties file 
	 */
	public static String getAppPassword() {
		return loadProperties().getProperty("password");
	}

	/**
	 * 
	 * @return
	 * This method will read the fluentWaitTime from config.properties file 
	 */
	public static long getFluentWaitTime() {

		return Long.parseLong(loadProperties().getProperty("fluentWaitTime"));
	}
}
