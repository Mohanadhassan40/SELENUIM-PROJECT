package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public void Searchfile ()  {	
	
	
Home Home=new home (driver);

}

public class TestNG_First {
  @Test
  public void f() {
	  System.out.println("this test annotation(7)");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 System.out.println("this is before method(4)");
  }

  @AfterMethod 
  public void afterMethod() {
	  System.out.println("this after method(6)");
  }

  @BeforeClass 
  public void beforeClass() {
	 System.out.println("this before class(3)");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this after class(8)");
	  
  }
  
  @Test (priority = 1)
  public void Test6() {
	  System.out.println("this other test OOOO(5)");
	  
  }
  @Test (priority = 2)
  
  

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("this is before test(2)");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is before suit(1)");
  }

  @AfterSuite
  public void afterSuite() {
	  
	 System.out.println("this us after suite");
  }

}
