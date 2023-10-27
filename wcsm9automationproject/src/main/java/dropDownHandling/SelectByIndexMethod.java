package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
	
		//identify dropdown option and click
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		//identify phone no. dropdown
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring  ease-linear transition-all duration-150 w-5/12']"));
		
		Select sel = new Select(dropdown1);
		Thread.sleep(2000);
		//select the option
		sel.selectByIndex(2);
		
		//identify country
		WebElement country = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		
		//select class for country dropdown
	    Select sel1 =  new Select(country);
	    Thread.sleep(2000);
	    sel1.selectByValue("India");
	    

	    //select the state dropdown
	     WebElement state = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
	     
	     //select class for  state dropdown
	    Select sel2 =  new Select(state);
	    Thread.sleep(2000);
	    sel2.selectByVisibleText("Maharashtra");
	    
	    //Select the multi select options
	    driver.findElement(By.partialLinkText("Multi Sel")).click();
	    
	    //select the country dropDown
	    WebElement multicountry = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
	    
	    Select sel3 = new Select(multicountry);
	    
	}

}
