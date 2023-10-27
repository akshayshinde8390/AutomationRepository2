package methodsOfWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("iphone");
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Thread.sleep(2000);
		//get the suggestion of iphone
		List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(WebElement phone:allIphone)
		{
			System.out.println(phone.getText());
		}

	}

}
