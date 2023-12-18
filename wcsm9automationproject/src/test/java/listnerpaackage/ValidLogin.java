package listnerpaackage;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomeListener.class)

public class ValidLogin extends BaseTest {
  @Test
  public void validLoginMethod() 
  {
	  String expectedLoginPage = "actiTIME - Login";
	 Assert.assertEquals(driver.getTitle(), expectedLoginPage);
	 
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
  }
}