package com.ExcelTestData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData extends BaseClass {

	public static void setup() throws Throwable {

		LoginPage lp = new LoginPage(driver);

		toLaunchBrowser("chrome");

		toLaunchUrl("http://www.demo.guru99.com/V4/index.php");

		toSleep();

		File f = new File("C:\\Users\\welcome\\Desktop\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("Login Data");

		// int nrow = sheet.getPhysicalNumberOfRows();

		// for (int i = 0; i < nrow; i++) {

		Row row = sheet.getRow(1);

		Cell cell = row.getCell(0);

		String scv = cell.getStringCellValue();

		if (scv.equals("mngr319520")) {
			System.out.println("UN matches");
			
		}
		
//		toSleep();
//		toEnterInputOnElement(lp.getUserid(),scv );
//		toSleep();

		Cell cell2 = row.getCell(1);
		
		String scv1 = cell2.getStringCellValue();
		
		if (scv1.equals("vAzUvEg")) {
			System.err.println("Pwd matches");
		}
		
		
		toSleep();
		toEnterInputOnElement(lp.getPwd(),scv1 );
		toSleep();

//		Row row2 = sheet.getRow(1);
//		row2.getCell(0)
	}

	public static void main(String[] args) throws Throwable {
		
		
		

		setup();
		

	
	
	}

}