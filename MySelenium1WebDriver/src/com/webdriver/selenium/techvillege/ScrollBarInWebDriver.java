package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarInWebDriver {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//ul/li/a[@href='https://www.lambdatest.com/selenium-automation']")).click();
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0, 5000)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@class='footer-menu']/li[1]/a")).click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		driver.quit();
	}

}
