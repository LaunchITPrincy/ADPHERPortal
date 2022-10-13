package utils.Helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

	public static Properties prop = null; 
	
	public static Properties getInstance()
	{
		if(prop == null)
			loadProperties();
		return prop;
	}
	
	private static void loadProperties() {
		try (InputStream input = new FileInputStream("C:\\Temp\\config-dev.properties")) {

			if(prop == null)
				prop = new Properties();

			if (input == null) {
				System.out.println("Sorry, unable to find config.properties");
				return;
			}

			// load a properties file from class path, inside static method
			prop.load(input);

			// get the property value and print it out
		//	System.out.println(prop.getProperty("app.url"));
		//	System.out.println(prop.getProperty("db.user"));
		//	System.out.println(prop.getProperty("db.password"));
//
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
