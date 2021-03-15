package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class utilityFunctions {
	
	//Method to return Properties file
	public static Properties loadProperties(String path) {
		
		Properties properties = new Properties();
		FileInputStream file = null;
		try {
			file = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			properties.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}

	
	public static Properties loadApplicationProperties()
	{
		Properties properties = loadProperties("src\\test\\resources\\properties\\applicationProperties");
		return properties;
		
	}
	
	public static Properties loadFrameworkProperties()
	{
		Properties properties = loadProperties("src\\test\\resources\\properties\\frameworkProperties");
		return properties;
		
	}
	
}
