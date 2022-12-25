package com.webdriver.selenium.techvillege;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyAmazon3 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		String base_url="https://www.amazon.com/";
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get(base_url);
		driver.manage().window().maximize();
		
		Select searchDDL=new Select(driver.findElement(By.id("searchDropdownBox")));
		//searchDDL.selectByVisibleText("Home & Kitchen");
		//searchDDL.selectByValue("search-alias=garden");
		//searchDDL.selectByIndex(19);
		
		List<WebElement> itemList=searchDDL.getOptions();
		System.out.println("Total Items:"+itemList.size());
		 
		for(WebElement item:itemList){  //item of itemList
			 System.out.println(item.getText());  
		} 
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee Maker");
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		
		
		//*[@id="u_0_f"]
		///html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div[1]/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input
		Thread.sleep(3000);
		driver.quit();
	}

}
