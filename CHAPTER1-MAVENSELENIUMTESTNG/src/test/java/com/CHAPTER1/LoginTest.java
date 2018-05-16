package com.CHAPTER1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.lang.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {
	
	public static WebDriver driver1;
	
  @Test
  public void f() {
	  
	  try {
		  System.out.println("driver.get starting");
		  //driver1.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		  driver1.get("http://www.google.com");
	
		//  System.out.println(driver1.getTitle() + " is the page title");
		  Assert.assertEquals(driver1.getTitle(), "Google");
		  
		  	  
//Assert.assertTrue(driver1.getTitle());	

	  } catch (Exception e) {
		 // e.printStackTrace();
		  System.out.println(e.getMessage());
		  System.out.println("Exception came");
	  }

  }
  
   @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver.exe");
	  driver1 = new ChromeDriver();
	  driver1.manage().window().maximize();
	 }
    
	@AfterMethod
	public void afterMethod() {
		driver1.quit();
	}
}
