package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassnameLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("textarea")).sendKeys("chandlr bing",Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.className("lNPNe")).click();

	}

}
