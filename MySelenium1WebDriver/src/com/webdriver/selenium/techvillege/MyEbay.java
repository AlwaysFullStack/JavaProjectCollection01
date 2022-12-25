package com.webdriver.selenium.techvillege;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyEbay {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		String base_url="https://www.ebay.com/";
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get(base_url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Espresso Maker", Keys.ENTER);
		
		List<WebElement> elements=driver.findElements(By.xpath("//li[starts-with(@id,'srp-river-results-listing')]/div/div/a"));
		int eSize=elements.size();
		System.out.println("Total Items: "+eSize);
		
		int i=0;
		String firstItem="";
		for(WebElement element:elements) {
			if(!element.getText().equals("")) {
				i++;
				//System.out.println(element.getText());
				System.out.println(element.getAttribute("href"));
				if(i<2) {
					firstItem=element.getAttribute("href");
					//element.click();
					//Thread.sleep(2000);
					//driver.navigate().to("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1312.R1.TR0.TRC0.A0.H0.TRS1&_nkw=Espresso+Maker&_sacat=0");
				}
			}
		}
		driver.navigate().to(firstItem);
		Thread.sleep(3000);
		driver.quit();
	}

}
