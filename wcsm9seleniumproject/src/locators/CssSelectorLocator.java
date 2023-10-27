package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");

		driver.findElement(By.cssSelector("button[class*='btn login-button btn-submit btn-small']")).click();//complete attribute value
		driver.findElement(By.cssSelector("button[class^='btn']")).click();//match starting char of attribute value
		driver.findElement(By.cssSelector("button[class$='btn-small']")).click();//for any end char of attribute value
		driver.findElement(By.cssSelector("button[class*='login-button']")).click();//for any match char of attribute value
		driver.findElement(By.cssSelector("input[name='userLoginId']")).sendKeys("admin");
	}

}
