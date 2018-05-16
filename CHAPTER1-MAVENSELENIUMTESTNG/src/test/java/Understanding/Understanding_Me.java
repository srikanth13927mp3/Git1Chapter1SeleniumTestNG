package Understanding;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Understanding_Me {
	
	public static WebDriver driver1;
	
  @Test
  public void f() {
	  Boolean Result;
	  Result = false;
	  String userdir;
	  
	  driver1.get("http://moneycontrol.com");
	  System.out.println(driver1.getTitle());
	  userdir = System.getProperty("user.dir");
	  System.out.println(System.getProperty("user.dir"));
	 

	  if (driver1.getTitle().indexOf("- Moneycontrol") > 1)
	  {
		  Result = true;
	  }
	  	  Assert.assertTrue(Result);
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\SELENIUM_LIB\\chromedriver.exe");
	  driver1 = new ChromeDriver();
	  driver1.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver1.quit();
  }

}
