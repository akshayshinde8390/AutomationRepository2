package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartFindElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		
		//driver.switchTo().activeElement().sendKeys("Laptop",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop",Keys.ENTER);
		Thread.sleep(2000);
   		
	//	driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
   		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
   		Thread.sleep(2000);
   		
   		driver.findElement(By.xpath("//div[text()='HP']")).click();
   		
   		//driver.findElement(By.xpath("//div[text()='Processor']")).click();
   		Thread.sleep(2000);
   		
   	//	driver.findElement(By.xpath("//span[text()='13 MORE']")).click();
   		
   	//	driver.findElement(By.xpath("//div[text()='Core i9']")).click();
   		
   	//	Thread.sleep(2000);
   		
   	//	driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Ryzen 9 Octa Core')]")).click();
        
   	//	driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
   	
   	//	driver.findElement(By.xpath("//div[text()='Ryzen 9 Octa Core']")).click();
   		
   	//	Thread.sleep(2000);
     
   		driver.findElement(By.xpath("//div[text()='Customer Ratings']")).click();
		
   		driver.findElement(By.xpath("//div[text()='3★ & above']")).click();
		
   		List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
   		List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
   		
   		for(int i=0;i<allLaptops.size();i++)
   		{
   			String laptop = allLaptops.get(i).getText();
   			Thread.sleep(2000);
   		  for(int j=1;j<=i;j++)
   		  {
   			allPrices.get(j).getText();
   			Thread.sleep(2000);
   			System.out.println(laptop+":"+allPrices);
   		  }

   		}

	}
}