package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Googlesearch 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.tagName("textarea")).sendKeys("admin");
	}

}
