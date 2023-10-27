package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-cnufa8l/login.do");
		
		//1. x path by using unique attribute
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admim");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		
		//2.x path by using text() function
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		//or
		driver.findElement(By.xpath("//a[.='Actimind Inc.']")).click();
		
	}

}