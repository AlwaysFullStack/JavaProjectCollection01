package com.webdriver.selenium.techvillege;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel3 {

	public static void main(String[] args) throws Exception {
		File src=new File("/Users/latif/Desktop/MySpreadSheet.xlsx");
		FileInputStream fid=new FileInputStream(src);
		
		// Open Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fid); 
		
		//creating a Sheet object to retrieve the object  
		XSSFSheet sheet1=wb.getSheetAt(0); 
		
		String base_url=sheet1.getRow(3).getCell(1).getStringCellValue();
		
		System.out.println(base_url);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get(base_url);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.quit();
		
		wb.close();
		}

}
