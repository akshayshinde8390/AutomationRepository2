package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IdLocator {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/as951/Desktop/wcsm9htmlcode/Loginpage.html");
		
		//identify username text box and pass input as "admin"
		driver.findElement(By.id("i1")).sendKeys("admin");
		//identify username text box and pass input as "manager"
		driver.findElement(By.id("i2")).sendKeys("manager");


	}

}
