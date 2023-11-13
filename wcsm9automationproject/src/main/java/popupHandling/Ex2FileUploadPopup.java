package popupHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2FileUploadPopup 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		//generate authentication pop up
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		WebElement doubleclick = driver.findElement(By.id("fileInput"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleclick).perform();
		
		Thread.sleep(2000);
		
		File file = new File("‪./autoITPgm/demoappslo1234567.exe");
		
		String absopath = file.getAbsolutePath();
		
		Runtime.getRuntime().exec(absopath);
		Thread.sleep(2000);
		Runtime.getRuntime().exec(absopath);
		
		Thread.sleep(2000);
		
	}

}
