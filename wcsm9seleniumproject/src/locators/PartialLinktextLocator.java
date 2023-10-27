package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PartialLinktextLocator {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/as951/Desktop/wcsm9htmlcode/Link.html");
		
		driver.findElement(By.partialLinkText("link")).click();

	}

}
