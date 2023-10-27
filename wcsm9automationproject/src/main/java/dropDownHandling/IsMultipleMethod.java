package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) 
	{
		//launch the browser
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//lauch the web application
				driver.get("http://demoapps.qspiders.com/");
				
				//identify the dropdown
				driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
				
				//single select
				WebElement dropDown1 = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
				//to check if dropdown is multiselect or not
				 Select sel = new Select(dropDown1);
				boolean status = sel.isMultiple();
				 System.out.println(status);
				 
				 //multi select 
				 //go to multi dropdown option
				 driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
				 WebElement dropDown2 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
				 
				//to check if dropdown is multiselect or not
				 Select sel1 = new Select(dropDown2);
				boolean status1 = sel1.isMultiple();
				 System.out.println(status1);
	}

}
