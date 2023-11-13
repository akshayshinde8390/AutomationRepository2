package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleconfirmationPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		Thread.sleep(2000);
		
		Alert confirm = driver.switchTo().alert();
		
		Thread.sleep(2000);
		confirm.accept();
		
		Thread.sleep(2000);
		//confirm.dismiss();

	}

}
