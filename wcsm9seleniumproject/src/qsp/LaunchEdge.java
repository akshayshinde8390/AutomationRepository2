package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//to launch edge browser
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com//");
		
		//to maximize the browser window
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		System.err.println("browser is maximize");
		System.out.println("browser is open");
		
		//to add delay for open browser
		Thread.sleep(5000);
		driver.close();
		System.out.println("browser is close");
	}

}
