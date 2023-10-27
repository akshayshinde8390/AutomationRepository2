package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//launch the edge browser
		WebDriver driver=new EdgeDriver();
		//to maximize the edge browser
		driver.manage().window().maximize();
		//launch the web application
		driver.get("https://www.primevideo.com");
		//to stop execution of script for 5 sec
		Thread.sleep(5000);
		//to close the browser
		driver.close();
	}

}
