package takeScreenshotMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenshotByusingWay1 {

	public static void main(String[] args) throws IOException
	{
		//directly create object ogf browser specific classes
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./Screenshots/way2.png");
		
		Files.copy(src, dest);

	}

}
