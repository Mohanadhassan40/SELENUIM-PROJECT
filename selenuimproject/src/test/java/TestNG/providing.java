package TestNG;

import org.testng.annotations.Test;

import Amazon_page.Home;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class providing {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws InterruptedException {
	  
	  WebDriver driver = null;
	Home home=new Home(driver);
	  home.FieldToEmail (n);
	  Thread.sleep(5000);
	  home.passwordTofield (s);
	  Thread.sleep(5000);
	  home.loginbtclick();
	  Thread.sleep(5000);
	  driver.navigate().back();
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
