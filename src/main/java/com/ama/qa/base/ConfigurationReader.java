package com.ama.qa.base;

import java.io.FileInputStream;

import java.util.Properties;

public class ConfigurationReader {
	static Properties configurationProps;

	static {

		try {
			configurationProps = new Properties();
			FileInputStream input = new FileInputStream(".//details.properties");
			configurationProps.load(input);
			input.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static String getProperty(String keyName) {
		return configurationProps.getProperty(keyName);
	}
}
