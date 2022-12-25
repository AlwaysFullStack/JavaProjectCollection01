package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyREferenceExample2 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://accounts.lambdatest.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		//Relative xpath for organization field
		driver.findElement(By.xpath("//input[@name='organization_name']")).sendKeys("Lambdates t Org");
		//Relative xpath for full name field
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sadhvi Singh");
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
