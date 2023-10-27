package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchChrome 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com//");
		
		//to maximize the browser window
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		System.out.println("browser is open");
		Thread.sleep(3000);
		driver.close();
		System.out.println("browser is close");
		
	}

}
