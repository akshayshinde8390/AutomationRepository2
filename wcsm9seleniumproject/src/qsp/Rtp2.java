package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp2 //run time Polymorphism
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the browser value");
		String browserValue = sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com//");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		else if(browserValue.equals("edge"))
		{
			driver=new EdgeDriver();
			driver.get("https://www.google.com//");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.close();
		}
		else
		{
			System.out.println("Enter valid browser value");
		}

	}

}
