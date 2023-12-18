package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description="This perform login poerations!!")
  public void method1() 
  {
	  Reporter.log("description flag use", true);
	  
  }
}
