package frame_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Bluestone_Chat_Icon {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/jewellery/watch+band.html");
		
	//	WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
	//	driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='fc_widget']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chat-fc-name")).sendKeys("akshay");
		
		driver.findElement(By.id("chat-fc-email")).sendKeys("akshay@123");
		
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
	}

}
