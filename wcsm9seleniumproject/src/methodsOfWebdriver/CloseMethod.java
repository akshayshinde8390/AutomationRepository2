package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		//launch the edge browser
				WebDriver driver=new EdgeDriver();
				
				//to maximize the edge browser
				driver.manage().window().maximize();
				
				//launch the web application
				driver.get("http://www.omayo.blogspot.com/");
				
				//to stop execution of script for 5sec
				Thread.sleep(2000);
				
				//click on open a pop window link
				driver.findElement(By.partialLinkText("Open a popup window")).click();
				Thread.sleep(4000);
				
				//to close the browser
				driver.close();

	}

}
