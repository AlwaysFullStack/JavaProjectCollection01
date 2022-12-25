package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyAmazon2 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		String base_url="https://www.amazon.com/";
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get(base_url);
		driver.manage().window().maximize();
		
		//Select searchDDL=new Select(driver.findElement(By.id("searchDropdownBox")));
		//searchDDL.selectByVisibleText("Home & Kitchen");
		//searchDDL.selectByValue("search-alias=garden");
		//searchDDL.selectByIndex(19);
		
		driver.findElement(By.id("searchDropdownBox")).sendKeys("e");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee Maker");
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
