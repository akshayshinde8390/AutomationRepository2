package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		//handle popup
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		
		//perform mousehover on watch jewellry
		WebElement watchjewelleryTarget  = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(watchjewelleryTarget).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		
		
		
	}

}
