package testNGAssertations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTestAssert {
  @Test
  public void assertMethod() 
  {
	  Reporter.log("Launch Browsers!!", true);
	  Reporter.log("Launch Webapplication by using url", true);
	  
	  Reporter.log("verify and validate the login page", true);
	  //apply soft assert
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(true, false);//soft assert
	  Reporter.log("Login performed", true);
	  
	  Reporter.log("verify and validate the home page", true);
	  //Apply hart assert
	  Assert.assertEquals(true, true);//hard assert
	  Reporter.log("user created", true);
	  Reporter.log("task created", true);
	  
	  
  }
}
