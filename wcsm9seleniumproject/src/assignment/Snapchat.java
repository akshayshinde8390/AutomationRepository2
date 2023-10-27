package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Snapchat {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://accounts.snapchat.com/accounts/v2/login");
	    driver.findElement(By.id("accountIdentifier")).sendKeys("admin");
	}

}
