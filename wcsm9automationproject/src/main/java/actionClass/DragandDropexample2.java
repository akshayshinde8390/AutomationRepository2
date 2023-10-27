package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropexample2
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//store all the drag element
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));//bank
		WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));//5000
		WebElement src3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));//sales
		
		//store all the drop element
		WebElement target1 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		WebElement target2 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		WebElement target3 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[4]"));
		WebElement target4 = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
		
		Actions act = new Actions(driver);
		
		//drag and drop element
		Thread.sleep(2000);
		act.dragAndDrop(src1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src3, target3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, target4).perform();
		
		
		
		
		

	}

}
