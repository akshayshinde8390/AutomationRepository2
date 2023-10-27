package methodsOfWebdriver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementMethod 
{

	public static void main(String[] args) 
	{
		 WebDriver driver=new EdgeDriver();
	   		driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   		driver.get("http://desktop-cnufa8l/login.do");
	   		WebElement usmTB = driver.findElement(By.name("username"));
	   		usmTB.sendKeys("admin");
	}
}