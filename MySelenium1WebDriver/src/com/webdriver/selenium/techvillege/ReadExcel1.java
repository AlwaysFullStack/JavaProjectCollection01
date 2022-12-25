package com.webdriver.selenium.techvillege;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {
		File src=new File("/Users/latif/Desktop/MySpreadSheet.xlsx");
		FileInputStream fid=new FileInputStream(src);
		
		// Open Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fid); 
		
		//creating a Sheet object to retrieve the object  
		XSSFSheet sheet1=wb.getSheetAt(0); 
		
		String data0=sheet1.getRow(3).getCell(1).getStringCellValue();
		
		System.out.println(data0);
		
		wb.close();
		}

}
