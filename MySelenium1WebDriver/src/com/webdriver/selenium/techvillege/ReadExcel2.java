package com.webdriver.selenium.techvillege;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		File src=new File("/Users/latif/Desktop/Data/FaceBook.xlsx");
		FileInputStream fid=new FileInputStream(src);
		
		// Open Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fid); 
		
		//creating a Sheet object to retrieve the object  
		XSSFSheet sheet1=wb.getSheetAt(1); 
		
		DataFormatter df=new DataFormatter();
		
		Iterator<Row> rowIterator=sheet1.rowIterator();
		while(rowIterator.hasNext()) {
			Row row=rowIterator.next();
			Iterator<Cell> cellIterator=row.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell=cellIterator.next();
				String cellValue=df.formatCellValue(cell);
				System.out.print(cellValue+"\t\t");
			}
			System.out.println();
		}
		
		wb.close();
		}

}
