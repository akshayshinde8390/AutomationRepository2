package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class TohandleOmayoDisableWebelemrnt {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		//perform scroll down
		JavascriptExecutor jse=(JavascriptExecutor)driver;

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,500)");
		
		//to pass the value in disabled text box
		jse.executeScript("document.getElementById('tb2').value='AkshayShinde'");
		
		//to take the screen shot of text box
		WebElement disableelement = driver.findElement(By.xpath("//input[@id='tb2']"));
		
		File src=disableelement.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/disableelement.png");
		
		Thread.sleep(2000);
		Files.copy(src, dest);
		
		driver.close();
				
				

	}

}
