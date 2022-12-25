package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleUsingIndex {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.lambdatest.com/register"); 
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//form/div[1]/input")).sendKeys("sadhvi singh");;
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
