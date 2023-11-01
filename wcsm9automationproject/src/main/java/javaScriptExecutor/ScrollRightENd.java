package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollRightENd {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
				
		//perform scroll down
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		for(int i=0;i<2;i++)
		{
			Thread.sleep(2000);
			jse.executeScript("Window.scrollBy(5000,0)");
		}

	}

}
