package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitleMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//to get title of webpage
		//String titleofpage = driver.getTitle();
		//System.out.println(titleofpage);   or
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
}
