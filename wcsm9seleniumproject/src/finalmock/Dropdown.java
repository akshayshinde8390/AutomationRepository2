package finalmock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		
		Select sel = new Select(dropdown);
		
		sel.selectByIndex(0);
		
		sel.selectByIndex(2);
		
		sel.deselectByIndex(0);
		
		sel.deselectByIndex(2);

	}

}
