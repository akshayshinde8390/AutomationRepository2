package takeScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenshotByWay4 //by using third party class EventFiring WebDriver(driver) 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.Atherenergy.com/");
		Thread.sleep(2000);
		
		EventFiringWebDriver ewf = new EventFiringWebDriver(driver);
		
		File src = ewf.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Ather.png");
		
		Files.copy(src, dest);
		
		driver.close();

	}

}
