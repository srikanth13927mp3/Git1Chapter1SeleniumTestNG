package com.CHAPTER1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class BingTest {
	
	public static  WebDriver driver1;
	
  @Test
  public void f() {
	  driver1.get("http://www.bing.com");
	 // System.out.println(driver1.getTitle() + " is the title");
	  Assert.assertEquals(driver1.getTitle(), "Bing");
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
	  driver1 = new ChromeDriver();
	  driver1.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	 Thread.sleep(3000);
	  driver1.quit();
  }

}
