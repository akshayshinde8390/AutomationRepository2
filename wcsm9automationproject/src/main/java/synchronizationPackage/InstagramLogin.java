package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InstagramLogin {

	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//apply implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
	
		driver.findElement(By.name("username")).sendKeys("admin123");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}