package com.ExcelTestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	
	public static void writeData() throws Throwable {

		File f = new File("C:\\Users\\welcome\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.createSheet("Login data");
		
		Row row1 = sheet.createRow(0);
		
		Cell cell1 = row1.createCell(0);
		
		Cell cell2 = row1.createCell(1);
		
	cell1.setCellValue("Username");
	cell2.setCellValue("Password");
	
	Row row2 = sheet.createRow(1);
	
	Cell cell3 = row2.createCell(0);
	
	Cell cell4 = row2.createCell(1);
	
	cell3.setCellValue("mngr319520");
	cell4.setCellValue("vAzUvEg");
	
Row row3 = sheet.createRow(2);
	
	Cell cell5 = row3.createCell(0);
	
	Cell cell6 = row3.createCell(1);
	
	cell5.setCellValue("mngr31952");
	cell6.setCellValue("vAzUvEg");
		
Row row4 = sheet.createRow(3);
	
	Cell cell7 = row4.createCell(0);
	
	Cell cell8 = row4.createCell(1);
	
	cell7.setCellValue("mngr319520");
	cell8.setCellValue("vAzUvE");
		
	
Row row5 = sheet.createRow(4);
	
	Cell cell9 = row5.createCell(0);
	
	Cell cell10 = row5.createCell(1);
	
	cell9.setCellValue("mngr31952");
	cell10.setCellValue("vAzUv");
		
	
	FileOutputStream fos = new FileOutputStream(f);
	
	wb.write(fos);
	
	wb.close();
	} 
	
	public static void main(String[] args) throws Throwable {
		writeData();
	}
}
