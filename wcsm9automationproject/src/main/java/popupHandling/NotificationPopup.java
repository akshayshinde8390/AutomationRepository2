package popupHandling;

import java.sql.Driver;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NotificationPopup 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("EnterBrowserValue!!");
		String browservalue = sc.next();
		
		if(browservalue.equalsIgnoreCase("Chrome"))
		{
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-Notification");
			driver= new ChromeDriver(co);
		}
		else if(browservalue.equalsIgnoreCase("Edge"))
		{
			EdgeOptions ed=new EdgeOptions();
			ed.addArguments("--disable-Notification");
			driver=new EdgeDriver(ed);	
		}
		else
		{
			System.out.println("browser not found");
		}
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
			
	}
		
	}