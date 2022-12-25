package com.examples.testng.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestingParameters {
	public WebDriver driver;
	public String baseurl="https://www.facebook.com";
	
	@Test
	@Parameters({"fName", "lName"})
	public void faceBookTest(String fName, String lName) {
		driver =new FirefoxDriver();
		driver.get(baseurl);
		
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//*[@id='u_0_e']")).sendKeys("TestNG First Name");
		driver.findElement(By.xpath("//*[@id='u_0_g']")).sendKeys("TestNG Last Name");*/
		
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
	 
}
