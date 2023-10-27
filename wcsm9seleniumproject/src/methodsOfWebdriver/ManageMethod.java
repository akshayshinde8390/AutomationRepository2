package methodsOfWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		//handle properties of browser such as maximize,minimize,fullscreen
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//to get fullscreen
		//driver.manage().window().fullscreen();
		//Thread.sleep(2000);
		//to set size of window
		Dimension targetsize = new Dimension(500, 600);
		driver.manage().window().setSize(targetsize);;
		Thread.sleep(2000);
		//set position of browser
		Point targetposition = new Point(350,250);
		driver.manage().window().setPosition(targetposition);
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		driver.close();
	}

}
