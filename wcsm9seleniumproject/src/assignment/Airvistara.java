package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Airvistara {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeOptions co = new EdgeOptions();//for disable notifications which are come in webpage
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new EdgeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=CjwKCAjwjaWoBhAmEiwAXz8DBfMrn6tlGAACXXFPHfMm83pbkiVaF_kmUVsXUqVMp4EoEzgde_ecuxoChYgQAvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=CjwKCAjwjaWoBhAmEiwAXz8DBfMrn6tlGAACXXFPHfMm83pbkiVaF_kmUVsXUqVMp4EoEzgde_ecuxoChYgQAvD_BwE:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&gad=1");
		
		driver.findElement(By.cssSelector("button[id='cookieModalCloseBtn']")).click();
		driver.findElement(By.cssSelector("input[name='flightSearchFrom']")).sendKeys("PNQ",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Select Arrival City']")).sendKeys("DEL",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Select Departure Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-date='24']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[placeholder='Select Return Date']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-date='27']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[placeholder='Select Passengers and Cabin Class ']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("button[class='bu_btn']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.className("col-xs-12 done_btn aubergine-button-dark passengerModalBtn")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
	}
	

}
