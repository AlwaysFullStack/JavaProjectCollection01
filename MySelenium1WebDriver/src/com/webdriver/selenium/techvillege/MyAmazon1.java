package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyAmazon1 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		String base_url="https://www.amazon.com/";
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get(base_url);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee Maker");
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
