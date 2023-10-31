package takeScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotByWay2  //upcast into remotewebdriver class
{

	public static void main(String[] args) throws IOException 
	{
		RemoteWebDriver rwd=new EdgeDriver();
		rwd.manage().window().maximize();
		rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		rwd.get("https://www.flipkart.com/");
		
		File src = rwd.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshots/flipkart.jpg");
		
		Files.copy(src, dest);
		
		rwd.close();		
		
		

	}

}
