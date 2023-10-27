package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//switch the controls to active element
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		
		//Switch the control to child window
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		String parenthandle = driver.getWindowHandle();
		System.out.println("address of parent window :"+parenthandle);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
	}
}
