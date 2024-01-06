package genericPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Flib implements IautoConstant
{
	static WebDriver driver;
	@BeforeMethod
	public void setUp() 
	{
Flib flib = new Flib();// read the data from property file .
		
	//	String browserValue = flib.readDataFromProperty("./src/main/resources/config.properties","Browser");
	//	String url = flib.readDataFromProperty("./src/main/resources/config.properties","Url");
		
		
	//	if(browserValue.equalsIgnoreCase("chrome"))
		{
		      driver=new ChromeDriver();	
		}
	//	else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
//		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	//	else
		{
			System.out.println("Invalid BrowserValue!!!");
		}

	}

}
