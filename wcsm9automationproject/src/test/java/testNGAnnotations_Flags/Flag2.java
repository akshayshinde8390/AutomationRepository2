package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description="running", enabled=true)
  public void method1() 
  {
	  Reporter.log("method 1 for login page", true);
  }
  
  @Test(description="create project under customer", enabled=true)
  public void method2()
  {
	  Reporter.log("method2 for users page", true);
  }
  @Test(description="deleting customer", enabled=true)
  public void method3()
  {
	  Reporter.log("Method 3 for logut page", true);
  }
}
