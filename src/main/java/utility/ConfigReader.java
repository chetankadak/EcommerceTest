package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	 public static Properties properties;

	    static {
	        try {
	            FileInputStream file =
	                    new FileInputStream("src/main/resource/propertiesfile/config.properties");

	            properties = new Properties();
	            properties.load(file);

	            file.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String getProperty(String key) {
	        return properties.getProperty(key);
	    }
}
