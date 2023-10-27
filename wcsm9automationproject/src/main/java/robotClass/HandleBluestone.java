package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleBluestone {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		
		WebElement moveon = driver.findElement(By.xpath("//li[@class='menuparent relative offers-menuparent']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(moveon).perform();
		
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		
		WebElement filterby = driver.findElement(By.xpath("//span[@class='f-by']"));
		
		for(int i=1;i<=2;i++)
		{
			act.doubleClick(filterby).perform();
			Thread.sleep(2000);
			act.clickAndHold(filterby).perform();
		}
		
		Robot robot = new Robot();
		
		//to copy the text
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(2000);
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("submit_search")).submit();
				
	}

}
