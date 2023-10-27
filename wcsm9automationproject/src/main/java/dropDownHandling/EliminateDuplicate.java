package dropDownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/as951/Desktop/wcsm9htmlcode/multiselectstaticdropdown.html");
		
		//identify dropdown and store it in refrance veriable
		WebElement menuDropDown = driver.findElement(By.id("idddd"));
		
		//get all the option of menuDropDown
		Select sel=new Select(menuDropDown);
		
		List<WebElement> allops = sel.getOptions();
		
		//to eliminate duplicates we use hashset
		HashSet<String> hs = new HashSet<String>();
		
		//read the list by using for loop and eliminate duplicates
		for(int i=0;i<allops.size();i++) 
		{
			WebElement op = allops.get(i);
			
			//get the text of WebElement
			String dropDownOption = op.getText();
			
			System.out.println(dropDownOption);
			
			//add the dropdown option into hashset  and remove duplicate
			hs.add(dropDownOption);	
		}
		Thread.sleep(2000);
		//read the options from hashset by using for each loop
		for(String opt:hs)
		{
			Thread.sleep(2000);
		    System.out.println(opt);
		}
	}

}
