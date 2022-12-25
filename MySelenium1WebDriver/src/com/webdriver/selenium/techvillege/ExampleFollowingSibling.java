package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleFollowingSibling {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.lambdatest.com/"); 
		driver.manage().window().maximize();
		
		//locating the 'sign-up' link using xpath following sibling and clicking on it.
		
		driver.findElement(By.xpath("//li[@class='nav-item'][5]//following-sibling::li")).click();
		//Verifying the current URL on which we post clicking on it.
		
		String currentURL= driver.getCurrentUrl();
		System.out.println(currentURL);
		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
