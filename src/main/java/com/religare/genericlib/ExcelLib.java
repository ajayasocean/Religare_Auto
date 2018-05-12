package com.religare.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	
	 String path = ".\\testData\\testData.xlsx";
	
	
	//String path ="C://Users//meankur//Downloads//_$testData.xlsx";
//_$testData.xlsx
	public String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable {

		FileInputStream file = new FileInputStream(path);

		Workbook wb = WorkbookFactory.create(file);

		Sheet sh = wb.getSheet(sheetName);

		// Row row = sh.getRow(rowNum);

		DataFormatter formatter = new DataFormatter();

		Cell cell = sh.getRow(rowNum).getCell(colNum);

		String data = formatter.formatCellValue(cell);
		// String data = row.getCell(colNum).getStringCellValue();

		wb.close();

		return data;
		// DataFormatter formatter = new DataFormatter(); //creating formatter using the
		// default locale
		// Cell cell = sheet.getRow(i).getCell(0);
		// String j_username = formatter.formatCellValue(cell);
		//
	}

	public void setExcelData(String sheetName, int rowNum, int colNum, String data) throws Throwable {

		FileInputStream file = new FileInputStream(path);

		Workbook wb = WorkbookFactory.create(file);

		Sheet sh = wb.getSheet(sheetName);

		Row row = sh.getRow(rowNum);

		Cell cel = row.createCell(colNum);

		cel.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(path);

		wb.write(fos);

		wb.close();

	}

}
