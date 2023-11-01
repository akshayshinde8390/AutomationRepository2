package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrllRIghtandLeft {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
				
		//perform scroll down
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,-500)");
		

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(500,0)");

		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(-500,0)");

	}

}
