package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class dotmovies {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dotmovies.bet/");
		
		driver.findElement(By.xpath("//a[text()='Download Salaar: Cease Fire – Part 1 (2023) HDTS Hindi-Dubbed (ORG-Line) Full Movie 480p [400MB] | 720p [1.2GB] | 1080p [3.5GB]']")).click();

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollby(0,500)");
	}

}
