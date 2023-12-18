package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void Method1() 
  {
	//  System.out.println("Method 1 from demo class");
	  Reporter.log("Method 1 from demo class",true);
  }
  
  @Test
  public void Method2() 
  {
	 // System.out.println("Method2 from demo class");
	  Reporter.log("Method 2 from demo class",true);
  }
  
  
}
