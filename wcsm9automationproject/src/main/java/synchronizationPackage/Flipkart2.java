package synchronizationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[.='✕']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone",Keys.ENTER);
		
		//driver.findElement(By.xpath("//div[.='APPLE iPhone 13 (Midnight, 128 GB)']")).click();
		
		driver.findElement(By.xpath("(//div[@class='_3pLy-c row'])[2]")).click();
		
		String parentHandle = driver.getWindowHandle();
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String wh: allhandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		//Iterator it=allhandles.iterator();
		
		//String parentid=(String) it.next();
		
		//tring childid=(String) it.next();
		
		//driver.switchTo().window(childid);
		
		driver.findElement(By.xpath("//li[@class'_3V2wfe' and (@id='swatch-3-color')]")).click();
		
		driver.findElement(By.xpath("//a[.='256 GB']")).click();
		
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411033",Keys.ENTER);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	}

}
