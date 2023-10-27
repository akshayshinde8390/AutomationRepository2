package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		//launch the browser
				WebDriver driver= new EdgeDriver();
				
				//maximize the window
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			   
				// use to launch Multi select dropdown
				driver.get("file:///C:/Users/as951/Desktop/wcsm9htmlcode/multiselectstaticdropdown.html");
				
				
				WebElement dropDownElement = driver.findElement(By.id("id4"));
			
				Select sel = new Select(dropDownElement);
				// select the options from dropDown
				for(int i=0;i<3;i++)
				{
					Thread.sleep(2000);
					sel.selectByIndex(i);
				}
				
				Thread.sleep(5000);
				//  to read the options that are selected
				List<WebElement> allOpts = sel.getAllSelectedOptions();
				
				// print the options that are selected
				for(WebElement opt:allOpts)
				{
					Thread.sleep(2000);
					System.out.println( opt.getText());
				}
	}

}
