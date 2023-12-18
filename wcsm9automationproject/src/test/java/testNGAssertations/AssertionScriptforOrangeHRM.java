package testNGAssertations;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionScriptforOrangeHRM 
{
	static WebDriver driver;
	@BeforeMethod
  @Test
  public void setUp() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-cnufa8l/login.do");
	}
	
	
	@Test
	public void testMethod() {
		String expectedLoginTitle="actiTIME - Login";
		SoftAssert sa = new SoftAssert();
		assertEquals(driver.getTitle(),expectedLoginTitle);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		String expectedHomeTitle="actiTIME - Enter Time-Track";
		
		Assert.assertEquals(driver.getTitle(),expectedHomeTitle);
		
		Reporter.log("User created", true);
		
		WebElement logoutlink = driver.findElement(By.partialLinkText("Logout"));
		
		Assert.assertEquals(logoutlink.isDisplayed(),true);
		
		logoutlink.click();
		sa.assertAll();
		
	}
}
