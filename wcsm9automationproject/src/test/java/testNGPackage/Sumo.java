package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void Method1() {
	  Reporter.log("Method 1 from Sumo class",true);
  }
  @Test
  public void Method2() {
	  Reporter.log("method2 from Sumo class", true);
  }
}
