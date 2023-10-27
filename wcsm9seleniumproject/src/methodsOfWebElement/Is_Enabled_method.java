package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Is_Enabled_method {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("akshay");
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("akshay1234");
		
		WebElement enabled = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
		
		boolean login = enabled.isEnabled();
		
		System.out.println(login);
	}

}
