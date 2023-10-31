package takeScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class TakeScreenshotFromWay5 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev");
		
		// take screenshot of the webpage 
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//call the method
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//define way for storing ss
		File dest = new File("./Screenshots/lol.png");
			    
		// store the screenshot into dest
		Files.copy(src, dest);
		
		

//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./screenShots/myfirstscreensho2.png");
//		Files.copy(src, dest);
//		driver.close();

	}

}
