package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickMethod {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-cnufa8l/login.do");
		
		WebElement userTF = driver.findElement(By.cssSelector("input[name='username']"));
		userTF.sendKeys("admin");
		
		WebElement passtf = driver.findElement(By.xpath("//input[@name='pwd']"));
		passtf.sendKeys("manager");
		
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkbox.click();
		
		WebElement button = driver.findElement(By.id("loginButton"));
		button.click();
	}

}
