
package data_driven_framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertyFile 
{
	public String getDataFromPropertyFile(String key) throws IOException 
{
		FileInputStream fis = new FileInputStream("./Test_Data/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}
}