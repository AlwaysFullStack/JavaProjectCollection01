package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamplePreceding {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.lambdatest.com/"); 
		driver.manage().window().maximize();
		
		//Fnding the automation link using the blog link
        //driver.findElement(By.xpath("//a[text()='Blog']//preceding::li[1]")).click();
		driver.findElement(By.xpath("//a[text()='Blog']//preceding::a[2]")).click();
      
		String currentURL= driver.getCurrentUrl();
		System.out.println(currentURL);
		
        Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
