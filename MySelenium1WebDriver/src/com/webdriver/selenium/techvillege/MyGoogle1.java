package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyGoogle1 {

	public static void main(String[] args) throws InterruptedException{
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
