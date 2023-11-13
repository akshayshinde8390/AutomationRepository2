package drag_drop_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuerv 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		//draggable and droppable elements are design under frame
		//handle frame by switches controls to frame
		//perform drag and drop
		//driver.switchTo().frame(0);//by using index value
		//Thread.sleep(2000);
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement); // by using webelement 
		Thread.sleep(2000);
		
		WebElement src1 = driver.findElement(By.id("draggable"));
		WebElement target1 = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src1, target1).perform();
		
		

	}

}
