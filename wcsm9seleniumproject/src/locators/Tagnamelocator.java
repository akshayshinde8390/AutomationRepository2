package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tagnamelocator {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/as951/Desktop/wcsm9htmlcode/Loginpage.html");
		
		//identify username text box and pass input as "Admin"
		driver.findElement(By.tagName("input")).sendKeys("Admin");
		
		Thread.sleep(2000);
		
		//identify password text box and pass input as "manager"
		driver.findElement(By.tagName("input")).sendKeys("Manager");


	}

}