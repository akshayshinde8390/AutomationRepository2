package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Stale 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://desktop-cnufa8l/login.do");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		driver.navigate().refresh();
		usnTB.sendKeys("admin");
		
	}

}
