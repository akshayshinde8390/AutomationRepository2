package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutActionClass {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
	
		//handle popup
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement coinsTarget = driver.findElement(By.xpath("//a[text()='Coins ']"));
		//use action class for mousehover
		Actions act = new Actions(driver);
		
		act.moveToElement(coinsTarget).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		
		if(driver.findElement(By.xpath("//h1[text()=' Lakshmigoldcoins ']")).isDisplayed())
		{
			System.out.println("text displayed!!");
		}
		
		else 
		{
			System.out.println("text not displayed!!");
		}
		
	}

}
