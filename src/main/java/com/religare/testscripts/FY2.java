package com.religare.testscripts;

import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FY2 {
	WebDriver driver;
	
	int index = 0;

	int rowNumber;

	@BeforeMethod

	public void launchDisclosurePage() {

		// Launching Chrome Driver

		System.setProperty("webdriver.chrome.driver", ".//resouRces//chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launching disclosure Page

		driver.get("https://rhicluat.religarehealthinsurance.com/public-disclosures.html");

	}
	@Test

	public void disclosurePageQtr1_16_17Test() throws Throwable {

		// Getting the size of frame
		Thread.sleep(1500);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 500)", "");
		
		driver.switchTo().frame(index);
		driver.findElement(By.xpath("//code[contains(text(),'FY 16-17')]")).click();
		Workbook workbook = new XSSFWorkbook();

		CreationHelper createHelper = workbook.getCreationHelper();

		Sheet sheet = workbook.createSheet("Qtr1_16_17");

		// Create a Font for styling header cells

		Font headerFont = workbook.createFont();

		headerFont.setBold(true);

		headerFont.setFontHeightInPoints((short) 14);

		headerFont.setColor(IndexedColors.RED.getIndex());

		// Create a CellStyle with the font

		CellStyle headerCellStyle = workbook.createCellStyle();

		headerCellStyle.setFont(headerFont);

		// Create a Row

		Row headerRow = sheet.createRow(0);

		String[] columns = { "PDF Name", "URL of Pdf", "Failed Title" };

		for (int j = 0; j < columns.length; j++) {

			Cell cell = headerRow.createCell(j);

			cell.setCellValue(columns[j]);

			cell.setCellStyle(headerCellStyle);

		}
		// Create Cell Style for formatting Date

		CellStyle dateCellStyle = workbook.createCellStyle();

		dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

		// Create Other rows and cells with employees data

		int rowNum = 1;

		int size = driver.findElements(By.tagName("iframe")).size();

		System.out.println("Total Frames --" + size);

		// Switching to frame

		try
		{
			driver.switchTo().frame(index);}
		catch
		(Exception e)
			
		{}
		WebElement container = driver.findElement(By.xpath("//a[contains(text(), 'Qtr 1 16-17')]"));

		container.click();

		String containerName = container.getText();

		System.out.println(containerName);

		// Getting the size of PDF's

		int size1 = driver.findElements(By.partialLinkText("test.pdf")).size();

		System.out.println(size1);

		int i;

		// Storing PDF's elements in list

		List<WebElement> web = driver.findElements(By.partialLinkText("test.pdf"));

		// Iterating the elements in loop

		for (i = 0; i < web.size(); i++) {

			// rowNum++;

			web.get(i).click();

			String pdfName = web.get(i).getText();

			String urlOFPdfs = web.get(i).getAttribute("href");

			System.out.println(urlOFPdfs);

			// Getting PDF's name

			System.out.println(pdfName);

			// Using Set for Window Handling

			Set<String> set = driver.getWindowHandles();

			// Iterating the windows

			Iterator<String> it = set.iterator();

			// Getting parentWindow ID

			String parentWin = it.next();

			// Getting childWindowID

			String childWin = it.next();

			// Switching to childWindow

			driver.switchTo().window(childWin);

			String pngName = "";

			pngName = pdfName;

			TakesScreenshot t = (TakesScreenshot) driver;

			File srcFile = t.getScreenshotAs(OutputType.FILE);

			File destFile = new File(".\\Qtr1-16-17Screenshot\\" + pngName + ".png");

			// File destFile = new File("D:\\Screenshots\\ financialD1 " + datef + ".png");

			org.apache.commons.io.FileUtils.copyFile(srcFile, destFile);

			// Getting the current URL

			System.out.println(driver.getCurrentUrl());

			String getTitle = driver.getTitle();

			// Checking if file not found

			// WebElement noFile = driver.findElement(By.tagName("p"));
			Row row = sheet.createRow(rowNum++);

			row.createCell(0).setCellValue(pdfName);

			row.createCell(1).setCellValue(urlOFPdfs);
			try {

				WebElement titleOfPage = driver.findElement(By.xpath("//div[@class='title']"));

				String failedTitle = titleOfPage.getText();

				System.out.println(failedTitle);
				row.createCell(2).setCellValue(failedTitle);

				// row.createCell(2).setCellValue(failedTitle);

			} catch (NoSuchElementException e) {

				e.getMessage();
			}

			for (int j = 0; j < columns.length; j++) {

				sheet.autoSizeColumn(j);
			}

			// Closing the current browser

			driver.close();

			// Switching to parentWindow

			driver.switchTo().window(parentWin);

			// Switching to frame for Qtr1_17_18

			driver.switchTo().frame(index);
		}
		LocalDateTime now = LocalDateTime.now();

		FileOutputStream fileOut = new FileOutputStream(".\\16_17ExcelSheets\\" + System.currentTimeMillis() + ".xlsx");

		workbook.write(fileOut);

		fileOut.close();

		driver.quit();
	}

	@Test

	public void disclosurePageQtr2_16_17Test() throws Throwable {

		// Getting the size of frame
		Thread.sleep(1500);
		driver.switchTo().frame(index);
		driver.findElement(By.xpath("//div[@headerindex ='1h']")).click();
		Workbook workbook = new XSSFWorkbook();

		CreationHelper createHelper = workbook.getCreationHelper();

		Sheet sheet = workbook.createSheet("Qtr2_16_17");

		// Create a Font for styling header cells

		Font headerFont = workbook.createFont();

		headerFont.setBold(true);

		headerFont.setFontHeightInPoints((short) 14);

		headerFont.setColor(IndexedColors.RED.getIndex());

		// Create a CellStyle with the font

		CellStyle headerCellStyle = workbook.createCellStyle();

		headerCellStyle.setFont(headerFont);

		// Create a Row

		Row headerRow = sheet.createRow(0);

		String[] columns = { "PDF Name", "URL of Pdf", "Failed Title" };

		for (int j = 0; j < columns.length; j++) {

			Cell cell = headerRow.createCell(j);

			cell.setCellValue(columns[j]);

			cell.setCellStyle(headerCellStyle);

		}
		// Create Cell Style for formatting Date

		CellStyle dateCellStyle = workbook.createCellStyle();

		dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

		// Create Other rows and cells with employees data

		int rowNum = 1;

		int size = driver.findElements(By.tagName("iframe")).size();

		System.out.println("Total Frames --" + size);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		try
		{
			driver.switchTo().frame(index);}
		catch
		(Exception e)
			
		{}
			

		WebElement container = driver.findElement(By.xpath("//a[contains(text(), 'Qtr 2 16-17')]"));

		container.click();

		String containerName = container.getText();

		System.out.println(containerName);

		// Getting the size of PDF's

		int size1 = driver.findElements(By.partialLinkText("NL")).size();

		System.out.println(size1);

		int i;

		// Storing PDF's elements in list

		List<WebElement> web = driver.findElements(By.partialLinkText("NL"));

		// Iterating the elements in loop

		for (i = 0; i < web.size(); i++) {

			// rowNum++;

			web.get(i).click();

			String pdfName = web.get(i).getText();

			String urlOFPdfs = web.get(i).getAttribute("href");

			System.out.println(urlOFPdfs);

			// Getting PDF's name

			System.out.println(pdfName);

			// Using Set for Window Handling

			Set<String> set = driver.getWindowHandles();

			// Iterating the windows

			Iterator<String> it = set.iterator();

			// Getting parentWindow ID

			String parentWin = it.next();

			// Getting childWindowID

			String childWin = it.next();

			// Switching to childWindow

			driver.switchTo().window(childWin);

			// Getting the current URL

			System.out.println(driver.getCurrentUrl());

			String getTitle = driver.getTitle();

			// Checking if file not found

			// WebElement noFile = driver.findElement(By.tagName("p"));
			Row row = sheet.createRow(rowNum++);

			row.createCell(0).setCellValue(pdfName);

			row.createCell(1).setCellValue(urlOFPdfs);

			try {

				WebElement titleOfPage = driver.findElement(By.xpath("//div[@class='title']"));

				String failedTitle = titleOfPage.getText();

				System.out.println(failedTitle);
				row.createCell(2).setCellValue(failedTitle);

				// row.createCell(2).setCellValue(failedTitle);

			} catch (NoSuchElementException e) {

				e.getMessage();
			}
			for (int j = 0; j < columns.length; j++) {

				sheet.autoSizeColumn(j);
			}

			// Closing the current browser

			driver.close();

			// Switching to parentWindow

			driver.switchTo().window(parentWin);

			// Switching to frame for Qtr1_17_18

			driver.switchTo().frame(index);
		}
		LocalDateTime now = LocalDateTime.now();

		FileOutputStream fileOut = new FileOutputStream(".\\16_17ExcelSheets\\" + System.currentTimeMillis() + ".xlsx");

		workbook.write(fileOut);

		fileOut.close();

		driver.quit();
	}

	@Test

	public void disclosurePageQtr3_16_17Test() throws Throwable {

		// Getting the size of frame
		Thread.sleep(1500);
		driver.switchTo().frame(index);
		driver.findElement(By.xpath("//div[@headerindex ='1h']")).click();
		Workbook workbook = new XSSFWorkbook();

		CreationHelper createHelper = workbook.getCreationHelper();

		Sheet sheet = workbook.createSheet("Qtr3_16_17");

		// Create a Font for styling header cells

		Font headerFont = workbook.createFont();

		headerFont.setBold(true);

		headerFont.setFontHeightInPoints((short) 14);

		headerFont.setColor(IndexedColors.RED.getIndex());

		// Create a CellStyle with the font

		CellStyle headerCellStyle = workbook.createCellStyle();

		headerCellStyle.setFont(headerFont);

		// Create a Row

		Row headerRow = sheet.createRow(0);

		String[] columns = { "PDF Name", "URL of Pdf", "Failed Title" };

		for (int j = 0; j < columns.length; j++) {

			Cell cell = headerRow.createCell(j);

			cell.setCellValue(columns[j]);

			cell.setCellStyle(headerCellStyle);

		}
		// Create Cell Style for formatting Date

		CellStyle dateCellStyle = workbook.createCellStyle();

		dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

		// Create Other rows and cells with employees data

		int rowNum = 1;

		int size = driver.findElements(By.tagName("iframe")).size();

		System.out.println("Total Frames --" + size);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		try
		{
			driver.switchTo().frame(index);}
		catch
		(Exception e)
			
		{}
		

		WebElement container = driver.findElement(By.xpath("//a[contains(text(), 'Qtr 3 16-17')]"));

		container.click();

		String containerName = container.getText();

		System.out.println(containerName);

		// Getting the size of PDF's

		int size1 = driver.findElements(By.partialLinkText("NL")).size();

		System.out.println(size1);

		int i;

		// Storing PDF's elements in list

		List<WebElement> web = driver.findElements(By.partialLinkText("NL"));

		// Iterating the elements in loop

		for (i = 0; i < web.size(); i++) {

			// rowNum++;

			web.get(i).click();

			String pdfName = web.get(i).getText();

			String urlOFPdfs = web.get(i).getAttribute("href");

			System.out.println(urlOFPdfs);

			// Getting PDF's name

			System.out.println(pdfName);

			// Using Set for Window Handling

			Set<String> set = driver.getWindowHandles();

			// Iterating the windows

			Iterator<String> it = set.iterator();

			// Getting parentWindow ID

			String parentWin = it.next();

			// Getting childWindowID

			String childWin = it.next();

			// Switching to childWindow

			driver.switchTo().window(childWin);

			String pngName = "";

			pngName = pdfName;

			TakesScreenshot t = (TakesScreenshot) driver;

			File srcFile = t.getScreenshotAs(OutputType.FILE);

			File destFile = new File(".\\Qtr3-16-17Screenshot\\" + pngName + ".png");

			// File destFile = new File("D:\\Screenshots\\ financialD1 " + datef + ".png");

			org.apache.commons.io.FileUtils.copyFile(srcFile, destFile);

			// Getting the current URL

			System.out.println(driver.getCurrentUrl());

			String getTitle = driver.getTitle();

			// Checking if file not found

			// WebElement noFile = driver.findElement(By.tagName("p"));
			Row row = sheet.createRow(rowNum++);

			row.createCell(0).setCellValue(pdfName);

			row.createCell(1).setCellValue(urlOFPdfs);

			try {

				WebElement titleOfPage = driver.findElement(By.xpath("//div[@class='title']"));

				String failedTitle = titleOfPage.getText();

				System.out.println(failedTitle);
				row.createCell(2).setCellValue(failedTitle);

				// row.createCell(2).setCellValue(failedTitle);

			} catch (NoSuchElementException e) {

				e.getMessage();
			}

			for (int j = 0; j < columns.length; j++) {

				sheet.autoSizeColumn(j);
			}

			// Closing the current browser

			driver.close();

			// Switching to parentWindow

			driver.switchTo().window(parentWin);

			// Switching to frame for Qtr1_17_18

			driver.switchTo().frame(index);
		}
		LocalDateTime now = LocalDateTime.now();

		FileOutputStream fileOut = new FileOutputStream(".\\16_17ExcelSheets\\" + System.currentTimeMillis() + ".xlsx");

		workbook.write(fileOut);

		fileOut.close();

		driver.quit();
	}

	@Test

	public void disclosurePageQtr4_16_17Test() throws Throwable {

		// Getting the size of frame
		Thread.sleep(1500);
		driver.switchTo().frame(index);
		driver.findElement(By.xpath("//div[@headerindex ='1h']")).click();
		Workbook workbook = new XSSFWorkbook();

		CreationHelper createHelper = workbook.getCreationHelper();

		Sheet sheet = workbook.createSheet("Qtr4_16_17");

		// Create a Font for styling header cells

		Font headerFont = workbook.createFont();

		headerFont.setBold(true);

		headerFont.setFontHeightInPoints((short) 14);

		headerFont.setColor(IndexedColors.RED.getIndex());

		// Create a CellStyle with the font

		CellStyle headerCellStyle = workbook.createCellStyle();

		headerCellStyle.setFont(headerFont);

		// Create a Row

		Row headerRow = sheet.createRow(0);

		String[] columns = { "PDF Name", "URL of Pdf", "Failed Title" };

		for (int j = 0; j < columns.length; j++) {

			Cell cell = headerRow.createCell(j);

			cell.setCellValue(columns[j]);

			cell.setCellStyle(headerCellStyle);

		}
		// Create Cell Style for formatting Date

		CellStyle dateCellStyle = workbook.createCellStyle();

		dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

		// Create Other rows and cells with employees data

		int rowNum = 1;

		int size = driver.findElements(By.tagName("iframe")).size();

		System.out.println("Total Frames --" + size);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		try
		{
			driver.switchTo().frame(index);
		}catch(Exception e)
		{}
		WebElement container = driver.findElement(By.xpath("//a[contains(text(), 'Qtr 4 16-17')]"));

		container.click();

		String containerName = container.getText();

		System.out.println(containerName);

		// Getting the size of PDF's

		int size1 = driver.findElements(By.partialLinkText("NL")).size();

		System.out.println(size1);

		int i;

		// Storing PDF's elements in list

		List<WebElement> web = driver.findElements(By.partialLinkText("NL"));

		// Iterating the elements in loop

		for (i = 0; i < web.size(); i++) {

			// rowNum++;

			web.get(i).click();

			String pdfName = web.get(i).getText();

			String urlOFPdfs = web.get(i).getAttribute("href");

			System.out.println(urlOFPdfs);

			// Getting PDF's name

			System.out.println(pdfName);

			// Using Set for Window Handling

			Set<String> set = driver.getWindowHandles();

			// Iterating the windows

			Iterator<String> it = set.iterator();

			// Getting parentWindow ID

			String parentWin = it.next();

			// Getting childWindowID

			String childWin = it.next();

			// Switching to childWindow

			driver.switchTo().window(childWin);

			String pngName = "";

			pngName = pdfName;

			TakesScreenshot t = (TakesScreenshot) driver;

			File srcFile = t.getScreenshotAs(OutputType.FILE);

			File destFile = new File(".\\Qtr4-16-17Screenshot\\" + pngName + ".png");

			// File destFile = new File("D:\\Screenshots\\ financialD1 " + datef + ".png");

			org.apache.commons.io.FileUtils.copyFile(srcFile, destFile);

			// Getting the current URL

			System.out.println(driver.getCurrentUrl());

			String getTitle = driver.getTitle();

			// Checking if file not found

			// WebElement noFile = driver.findElement(By.tagName("p"));
			Row row = sheet.createRow(rowNum++);

			row.createCell(0).setCellValue(pdfName);

			row.createCell(1).setCellValue(urlOFPdfs);
			try {

				WebElement titleOfPage = driver.findElement(By.xpath("//div[@class='title']"));

				String failedTitle = titleOfPage.getText();

				System.out.println(failedTitle);
				row.createCell(2).setCellValue(failedTitle);

				// row.createCell(2).setCellValue(failedTitle);

			} catch (NoSuchElementException e) {

				e.getMessage();
			}

			for (int j = 0; j < columns.length; j++) {

				sheet.autoSizeColumn(j);
			}

			// Closing the current browser

			driver.close();

			// Switching to parentWindow

			driver.switchTo().window(parentWin);

			// Switching to frame for Qtr1_17_18

			driver.switchTo().frame(index);
		}
		LocalDateTime now = LocalDateTime.now();

		FileOutputStream fileOut = new FileOutputStream(".\\16_17ExcelSheets\\" + System.currentTimeMillis() + ".xlsx");

		workbook.write(fileOut);

		fileOut.close();

		driver.quit();
	}
}
