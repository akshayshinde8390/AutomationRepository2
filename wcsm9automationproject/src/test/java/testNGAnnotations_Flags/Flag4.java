package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 
{
  @Test(priority = 2)
  public void f() 
  {
	  Reporter.log("f");
  }
  @Test(priority = 0)
  public void p() 
  {
	  Reporter.log("p");
  }
  @Test(priority = 1)
  public void k() 
  {
	  Reporter.log("k");
  }
  @Test(priority = 3)
  public void a() 
  {
	  Reporter.log("a");
  }
  @Test
  public void l() 
  {
	  Reporter.log("l");
  }
  
}
