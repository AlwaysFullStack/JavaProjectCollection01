package com.webdriver.selenium.techvillege;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavbarofBankofamerica {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bankofamerica.com/"); 
		driver.manage().window().maximize();
		
		String myXpath="//ul[@class='main-nav-links']//li";
		
		//ul[@class='main-nav-links']//li[1]/a
		
		//List<WebElement> items=driver.findElements(By.xpath("//ul[@class='main-nav-links']//li"));
		List<WebElement> items=driver.findElements(By.xpath(myXpath));
		int i=0;
		System.out.println(items.size());
		for(WebElement item:items) {
			if(!item.getText().equals("")) {
				i++;
				System.out.println(i+". "+item.getText());
				if(i!=6) {
					String newXPath=myXpath+"["+i+"]//a";
					//System.out.println(newXPath);
				
					driver.findElement(By.xpath(newXPath)).click();
					Thread.sleep(2000);
				}
			}
		}
		
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
