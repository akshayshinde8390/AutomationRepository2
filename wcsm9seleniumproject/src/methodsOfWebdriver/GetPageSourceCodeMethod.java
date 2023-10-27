package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetPageSourceCodeMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("http://desktop-cnufa8l/login.do");
		String pagesourcecode = driver.getPageSource();
		System.out.println(pagesourcecode);
		Thread.sleep(2000);
		driver.quit();
	}

}
