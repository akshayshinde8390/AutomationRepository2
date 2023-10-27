package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWraapedElementMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/as951/Desktop/wcsm9htmlcode/multiselectstaticdropdown.html");

		//single select dropdown
		WebElement dropDown1 = driver.findElement(By.id("idddd"));
		
		//handle dropdown
		Select sel = new Select(dropDown1);
		
		//get all the options from dropdown by using getwrappedElement
		WebElement allops = sel.getWrappedElement();
		System.out.println(allops.getText());
		
		//get all the options from dropdown by using getoptions
		List<WebElement> options = sel.getOptions();
		
//		for(WebElement opt:options) 
//		{
//			Thread.sleep(2000);
//			
//			System.out.println(opt.getText());
//		}
	
		//select the option from dropdown without using selection method
		for(WebElement opt:options) 
			{
				Thread.sleep(2000);
				if(opt.getText().equals("vadapav")) 
				{
					opt.click();
					break;
				}
				
			}
		
		
	
	}
}
