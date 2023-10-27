package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetLocation_GetSize_GetReact_Methods {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");

		//identify email text box
		WebElement emailtextbox = driver.findElement(By.cssSelector("input#email"));//we can use syntax= tagname#attribute_value for css selector
		
		//get the location of email text box
		Point loc = emailtextbox.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		System.out.println("location of email text box: " +xaxis + ":"+yaxis);
		
		//get the size of email text box
		Dimension size = emailtextbox.getSize();
		
		int height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println("Size of email text box: "+ height+" :"+width);
		
		//check result by using get css value method
		String tag = emailtextbox.getCssValue("width");
		System.out.println("width of email text field: "+tag);
		
		//get the location of email text box and size of the email text box
		Rectangle rect = emailtextbox.getRect();
		
		System.out.println("location of email text box: "+rect.getX()+"  :"+rect.getY());
		System.out.println("size ofemail text box: "+rect.getHeight()+"  :"+rect.getWidth());
	}

}
