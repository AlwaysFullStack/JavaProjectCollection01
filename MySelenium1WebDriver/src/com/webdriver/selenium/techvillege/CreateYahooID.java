package com.webdriver.selenium.techvillege;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateYahooID {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		String base_url="https://login.yahoo.com/account/create?.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.src%3Dfp&src=ym&specId=yidReg";
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get(base_url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Abdul");
		driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Latif");
		driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys("latif0802202020");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Jugantor@2020");
		driver.findElement(By.xpath("//input[@type='tel' and @name='phone']")).sendKeys("2104216399");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(@href, 'https://app.appsflyer.com/id577586159')]")).click();
		// Look for the first name: 
		
		Thread.sleep(15000);
		driver.quit();
	}

}
