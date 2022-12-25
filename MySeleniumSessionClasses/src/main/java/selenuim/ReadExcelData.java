package selenuim;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File src=new File("/Users/latif/Desktop/Data/TestData.xlsx");
		FileInputStream fid=new FileInputStream(src);
		
		//Load Workbook
		XSSFWorkbook wb=new XSSFWorkbook(fid);
		
		//Load Worksheet
		XSSFSheet sh1=wb.getSheetAt(0);
		String data0=sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data0);

	}

}
