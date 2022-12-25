package com.webdriver.selenium.techvillege;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTopNavItems2 {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.lambdatest.com/"); 
		driver.manage().window().maximize();
		
		String myXPath="//ul[@class='navbar-nav']/li";
		
		List<WebElement> items=driver.findElements(By.xpath(myXPath));
		//ul[@class='navbar-nav']/li[1]/a
		//System.out.println(items.size());
		String newXPath="";
		int i=0;
		for(WebElement item:items) {
			i++;
			//System.out.println(i+", "+item.getText()+", ");
			newXPath=myXPath+"["+i+"]/a";
			System.out.println(newXPath);
			driver.findElement(By.xpath(newXPath)).click();
			Thread.sleep(2000);
			driver.navigate().back();
		}
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
