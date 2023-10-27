package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/as951/Desktop/wcsm9htmlcode/multiselectstaticdropdown.html");

		//single select dropdown
		WebElement dropDown1 = driver.findElement(By.id("idddd"));
		
		//handle the dropdown
		Select sel = new Select(dropDown1);
		
		//select the option from dropdown
		Thread.sleep(2000);
		sel.selectByValue("v7");
		
		Thread.sleep(2000);
		
		//get the option which is selected first
		WebElement firstOpt = sel.getFirstSelectedOption();
		
		//get the text of firstOpt
		System.out.println(firstOpt.getText());
		
		//multi select dropdown
		driver.navigate().to("file:///C:/Users/as951/Desktop/wcsm9htmlcode/multiselectstaticdropdown.html");
		
		//identify dropdown
		WebElement dropDown2=driver.findElement(By.id("idddd"));
		
		//handle the multi select dropdown
		Select Sel2=new Select(dropDown2);
		
		//select multiple option from multi select dropdown
		for(int i=5;i<8;i++)
		{
			Thread.sleep(2000);
			Sel2.selectByIndex(i);
		}
		
		//get option which selected first
		Thread.sleep(2000);
		System.out.println(Sel2.getFirstSelectedOption().getText());
		
	}
	

}
