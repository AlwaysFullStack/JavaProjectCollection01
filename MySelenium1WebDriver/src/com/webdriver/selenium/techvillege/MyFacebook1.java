package com.webdriver.selenium.techvillege;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFacebook1 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//WebDriverWait wait = new WebDriverWait(driver,5)
				 
		//		wait.until(ExpectedConditions.visibilityOf(element));
		
		//WebElement elements = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.id("someid")));
		 

		//WebDriverWait wait = new WebDriverWait(driver,5);
		 
		//wait.until(ExpectedConditions.visibilityOf(elements));
		
		WebElement element;
		//element=driver.findElement(By.name("firstname"));
		element=driver.findElement(By.id("u_0_f"));
		element.sendKeys("Hasanuzzaman");
		
		element=driver.findElement(By.name("lastname"));
		element.sendKeys("Maruf");
		
		/*element=driver.findElement(By.name("reg_email__"));
		element.sendKeys("hMaruf@gmail.com");
		
		element=driver.findElement(By.name("reg_passwd__"));
		element.sendKeys("PasswordAnywhere123");
		
		element=driver.findElement(By.name("reg_email_confirmation__"));
		element.sendKeys("PasswordAnywhere123");*/
		
		Select ddl=new Select(driver.findElement(By.name("birthday_month")));
		ddl.selectByVisibleText("Jun");
		
		
		//driver.findElement(By.name("birthday_month"));
		//element.
		
		Thread.sleep(3000);
		driver.quit();
	}

}
