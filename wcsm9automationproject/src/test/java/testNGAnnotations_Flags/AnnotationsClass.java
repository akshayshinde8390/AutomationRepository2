package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void annotations_Test_Method() 
  {
	  Reporter.log("test Annotation", true);
  }
  @BeforeMethod
  public void annotation_BeforeMethod()
  {
	  Reporter.log("Before Method Annotation", true);
  }
  @BeforeClass
  public void annotation_BeforeClass()
  {
	  Reporter.log("Before class Annotation", true);
  }
  @AfterClass
  public void annotation_AfterclassMethod()
  {
	  Reporter.log("After Class Annotation", true);
  }
  @AfterMethod
  public void annotation_AfterMethod()
  {
	  Reporter.log("After Method Annotation", true);
  }
  @BeforeTest
  public void annotation_BeforeTestMethod()
  {
	  Reporter.log("Before Test Annotation", true);
  }
  @BeforeSuite
  public void annotation_BeforeSuite()
  {
	  Reporter.log("Before Suite Annotation", true);
  }
  @AfterTest
  public void annotation_AfterTest()
  {
	  Reporter.log("After Test Annotation", true);
  }
  @AfterSuite
  public void annotation_AfterSuite()
  {
	  Reporter.log("AfterSuite Annotation", true);
  }
}
