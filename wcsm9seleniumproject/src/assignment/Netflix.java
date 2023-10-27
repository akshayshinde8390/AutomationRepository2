package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Netflix 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.netflix.com/in/Login");
		driver.manage().window().maximize();
		
		//identify phone or Email web element
		driver.findElement(By.id("id_userLoginId")).sendKeys("admin");
		Thread.sleep(2000);
		//identify password text box
		driver.findElement(By.id("id_password")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
		
	}
	

}
