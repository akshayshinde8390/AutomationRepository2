package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		//handle alert popup
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		//accept alert popup
		Thread.sleep(2000);
		//alert.accept();
		
		//get the text of alert popup
		String textofalert = alert.getText();
		System.out.println(textofalert);
		
		//to dismiss alert popup
		alert.dismiss();
	}

}
