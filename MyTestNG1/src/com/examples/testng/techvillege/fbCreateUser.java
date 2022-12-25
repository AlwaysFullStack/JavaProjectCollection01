package com.examples.testng.techvillege;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class fbCreateUser {
	public WebDriver driver;
	public String baseurl="https://www.facebook.com";
	
  @Test(dataProvider = "dp")
  public void fbInfo(String fName, String lName) {
	  	driver =new FirefoxDriver();
		driver.get(baseurl);
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='u_0_e']")).sendKeys(fName);
		driver.findElement(By.xpath("//*[@id='u_0_g']")).sendKeys(lName);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Abdul", "Latif" },
      new Object[] { "Munir", "Khan" },
    };
  }
}
