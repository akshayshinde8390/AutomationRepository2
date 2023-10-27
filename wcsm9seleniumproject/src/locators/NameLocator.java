package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/as951/Desktop/wcsm9htmlcode/Radiobuttons.html");
		Thread.sleep(2000);
		//identify the D radio button by using name locator
		driver.findElement(By.name("name4")).click();
		Thread.sleep(2000);
		//identify the A radio button by using name locator
		driver.findElement(By.name("name1")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name2")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name3")).click();
		driver.close();
	}
}
