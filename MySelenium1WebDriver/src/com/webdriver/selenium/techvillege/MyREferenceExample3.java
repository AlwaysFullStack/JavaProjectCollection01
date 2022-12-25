package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyREferenceExample3 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///Users/latif/Desktop/sarfaraz/index.html"); 
		driver.manage().window().maximize();
		//Finding the work email filed using the child locator xpath axes
		driver.findElement(By.xpath("//div[@class='col-sm-12 google-sign- form']/child::input[3]")).sendKeys("sadhvi singh");;
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
