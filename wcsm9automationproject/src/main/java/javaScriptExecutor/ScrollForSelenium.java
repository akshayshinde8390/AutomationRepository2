package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScrollForSelenium {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
				
		//perform scroll down
		Thread.sleep(2000);

		WebElement twitter = driver.findElement(By.xpath("(//a[@class='text-white'])[2]"));
		
		Point loc = twitter.getLocation();
		
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
		Thread.sleep(2000);
		
		//to take screenshot
		File src=twitter.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/twitter.png");
		
		Files.copy(src, dest);
		
	}

}
