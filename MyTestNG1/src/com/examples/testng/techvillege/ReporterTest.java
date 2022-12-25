package com.examples.testng.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterTest {
	public WebDriver driver;
	public String baseurl="https://www.facebook.com";
	public String fName="Kamrul";
  	public String lName="Hassan";
	
  @Test
  public void fbCredentials() {
	  	
	  	
	  	driver =new FirefoxDriver();
		Reporter.log("Browser Lunched");
	  	driver.get(baseurl);
		
	  	Reporter.log("Maximized Browser");
		driver.manage().window().maximize();
		
		Reporter.log("Loacte First Name");
		driver.findElement(By.xpath("//*[@id='u_0_e']")).sendKeys(fName);
		Reporter.log("Loacte Last Name");
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
}
