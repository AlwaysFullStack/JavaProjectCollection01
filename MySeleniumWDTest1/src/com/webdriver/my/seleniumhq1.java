package com.webdriver.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumhq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/latif/Downloads/chromedriver");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Projects")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
