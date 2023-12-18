package listnerpaackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import com.google.common.io.Files;

public class BaseTest 
{static WebDriver driver;
  @BeforeMethod
  public void setUp() 
  {
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://desktop-cnufa8l/login.do");
  }
  
  public void failedSsmethod(String failedMethodName)
  {
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   File dest = new File("./Screenshots/"+failedMethodName+".png");
	  
	   try 
	   {
		Files.copy(src, dest);
	   } 
	   catch (Exception e)
	   {
		   
	   }
	   
  }
}
