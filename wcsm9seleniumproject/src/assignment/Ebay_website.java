package assignment;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ebay_website {

	static WebDriver driver;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pass the browser name which u want to launch");
		String browserValue = sc.next();
		
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("this is not a browservalue!!");
		}
			
		//WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Apple Watches");
		
		//driver.findElement(By.xpath("//input[@id='gh-btn']")).submit();
	}
		
		public static void SearchProduct(String product) throws InterruptedException
		{
			//WebDriver driver=new EdgeDriver();
			//driver.get("https://www.ebay.com/");
			
			
			 WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
			searchbox.sendKeys(product);
			Thread.sleep(2000);
			
			driver.findElement(By.name("url")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[text()='Watches]")).click();
		}
	}





