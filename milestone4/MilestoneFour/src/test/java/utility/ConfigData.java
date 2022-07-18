package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author M1088236
 *
 */

public class ConfigData {

	
	Properties properties;

	public ConfigData() {

		File src = new File("./config/Config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);

			properties = new Properties();

			properties.load(fis);
		} catch (Exception e) {

			System.out.println("Unable to load config file");
		}

	}

	/**
	 * 
	 * @param key
	 * @return string object which is from property file
	 */
	public String getData(String key) {
		
		return properties.getProperty(key);
	}
	

}
