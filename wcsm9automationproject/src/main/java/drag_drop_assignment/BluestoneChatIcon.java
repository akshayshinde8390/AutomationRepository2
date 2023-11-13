package drag_drop_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BluestoneChatIcon {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/jewellery/watch+band.html");
		
	//	WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
	//	driver.switchTo().frame(1);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='fc_widget']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		
	//	Actions act = new Actions(driver);
	}

}
