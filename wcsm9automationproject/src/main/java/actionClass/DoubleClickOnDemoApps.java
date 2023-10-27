package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickOnDemoApps 
{

	public static void main(String[] args) 
	{

		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		driver.findElement(By.partialLinkText("Double Click")).click();
		
		WebElement click1 = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		WebElement click2 = driver.findElement(By.xpath("(//button[text()='Yes'])[2]"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(click1).perform();
		act.doubleClick(click2).perform();
		

	}

}
