package com.webdriver.selenium.techvillege;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTopNavItems {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.lambdatest.com/"); 
		driver.manage().window().maximize();
		
		List<WebElement> items=driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
		
		//System.out.println(items.size());
		for(WebElement item:items) {
			System.out.println(item.getText()+", "+item.getAttribute("href"));
		}
		
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
