package finalmock;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Zomato
{
	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/india");
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollby(0,-800)");
}
}