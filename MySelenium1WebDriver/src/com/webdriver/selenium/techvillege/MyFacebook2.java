package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFacebook2 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		/*driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("My First Name");
		driver.findElement(By.xpath("//input[@id='u_0_h']")).sendKeys("My Last Name");
		driver.findElement(By.xpath("//input[@type='radio'][@id='u_0_9']")).click();
		 driver.findElement(By.xpath("//button[text()='Sign Up'][@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();*/
		
		//a[@class='_8esh']
		//a[text()='Create a Page']
		//a[contains(text(),'a Page')]
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
