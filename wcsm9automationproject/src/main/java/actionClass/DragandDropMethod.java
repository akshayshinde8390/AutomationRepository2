package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Drag And Drop']")).click();
		
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		//store all the drag element
		WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement src2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement src3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement src4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		//store all the drop element
		WebElement target1 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
		WebElement target2 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
		
		Actions act = new Actions(driver);
		//perform drag and drop for mobile
		Thread.sleep(2000);
		act.dragAndDrop(src1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, target1).perform();
		
		//perform drag & drop for laptop
		Thread.sleep(2000);
		act.dragAndDrop(src3, target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src4, target2).perform();
	}

}
