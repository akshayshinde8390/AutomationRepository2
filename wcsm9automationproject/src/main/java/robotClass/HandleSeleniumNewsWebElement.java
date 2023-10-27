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

public class HandleSeleniumNewsWebElement {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/");
		
		Thread.sleep(2000);
		//identify news element
		WebElement rightclick = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		
		//perform right click on news
		Actions act = new Actions(driver);
		
		act.contextClick(rightclick).build().perform();
		
		//press pagedown go till to inspect
		Robot robot = new Robot();
		
		for(int i=0; i<=11; i++)
		{
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
