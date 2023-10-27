package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartSynchronize {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		//to apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Login']")).click();

	}

}
