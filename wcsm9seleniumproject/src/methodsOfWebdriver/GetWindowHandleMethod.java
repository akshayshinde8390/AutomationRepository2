package methodsOfWebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetWindowHandleMethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		String parenthandle = driver.getWindowHandle();
		System.out.println("address of parent window :"+parenthandle);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Set<String> allhandles = driver.getWindowHandles();
		for(String wh:allhandles)
		{
			//System.out.println("parent handle :"+wh+"child handle: "+wh);
			if(!parenthandle.equals(wh))// 
			{
				System.out.println("address of child window :"+wh);
			}
			else
			{
				System.out.println("address of parent window :"+wh);
			}
		}
	}

}
