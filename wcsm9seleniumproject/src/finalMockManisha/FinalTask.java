package finalMockManisha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalTask {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class=\"_30XB9F\"]")).click();
		driver.findElement(By.name("https://www.flipkart.com/")).sendKeys("mobile");
		driver.findElement(By.xpath("//div[text()=\"APPLE iPhone 14 (Blue, 128 GB)\"]/ancestor::div[@class=\"col col-7-12\"]"));
	}

}
