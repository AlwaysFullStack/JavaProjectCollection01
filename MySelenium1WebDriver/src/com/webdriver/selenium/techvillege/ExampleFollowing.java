package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleFollowing {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.lambdatest.com/"); 
		driver.manage().window().maximize();
		
		//Locate element with the link blog using following axes
        driver.findElement(By.xpath("//ul[@class='navbar-nav']//following::li[3]")).click();
		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
