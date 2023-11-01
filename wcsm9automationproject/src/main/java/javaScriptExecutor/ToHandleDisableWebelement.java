package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleDisableWebelement {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com");
		
		driver.findElement(By.xpath("//p[text()='Enabled Mode']")).click();
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		
		//explicit type casting into java script executor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//to handle disabled name text field
		jse.executeScript("document.getElementById('name').value='Akshay'");
		
		//to handle disabled email text box
		jse.executeScript("document.getElementById('email').value='Akshay123@gmail.com'");
		
		//to handle password text box
		jse.executeScript("document.getElementById('password').value='Akshay@123'");
		
		WebElement disablebutton = driver.findElement(By.xpath("//button[text()='Register']"));
		
		WebElement loginbutton = driver.findElement(By.xpath("//a[@class='bg-orange-500 hover:bg-orange-700 text-white py-2 px-4 rounded']"));
		
		if(disablebutton.isDisplayed()) 
		{
			jse.executeScript("arguments[0].click()",disablebutton);
			System.out.println("Click");
			
			jse.executeScript("arguments[0].click()",loginbutton);
		}
		else 
		{
			System.out.println("Not Click");
		}
		
	}

}
