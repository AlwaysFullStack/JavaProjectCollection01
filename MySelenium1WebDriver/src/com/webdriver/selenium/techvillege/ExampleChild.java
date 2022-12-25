package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleChild {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.lambdatest.com/register");
		driver.manage().window().maximize();
		
		//Finding the work email filed using the child locator xpath axes
		driver.findElement(By.xpath ("//div[@class='clearfix registeraArea signUpWithEmail']//form/child::div[2]/child::input")).sendKeys("sadhvi_singh@gmail.com ");
		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
