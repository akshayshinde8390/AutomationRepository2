package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-cnufa8l/login.do");
		
		WebElement userTF = driver.findElement(By.cssSelector("input[name='username']"));
		userTF.sendKeys("admin");
		
		WebElement passtf = driver.findElement(By.xpath("//input[@name='pwd']"));
		passtf.sendKeys("manager");
		
		//to clear username and password textbox
		Thread.sleep(2000);
		//driver.findElement(By.name("username")).clear();
		userTF.clear();
		Thread.sleep(2000);
		//driver.findElement(By.name("password")).clear();
		passtf.clear();

	}

}
