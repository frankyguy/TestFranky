package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	protected static Properties projectProperties;
	
	public static Properties readPropertyFile() {
		try {
			projectProperties= new Properties();
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
			projectProperties.load(fis);
		}catch (IOException e) {
			e.getMessage();
		}
		return projectProperties;

	}


}
