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

public class OtherDiscIndAgentPTest {

	WebDriver driver;

	int rowNumber;

	String pdfName;
	
	String pngName;

	int index = 0;
	@BeforeMethod

	public void launchDisclosurePage() {

		// Launching Chrome Driver

		System.setProperty("webdriver.chrome.driver", ".//resouRces//chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launching disclosure Page

		driver.get("https://rhicluat.religarehealthinsurance.com/other-disclosures.html");

	}

	@Test

	public void otherIndividualAgentsPublicDisclosureTest() throws Throwable {

		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook();

		CreationHelper createHelper = workbook.getCreationHelper();

		Sheet sheet = workbook.createSheet("OtherD1");

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
		int rowNum1 = 1;

		int size = driver.findElements(By.tagName("iframe")).size();

		System.out.println("Total Frames --" + size);

		// jse.executeScript("window.scrollBy(0, 200)", "");

		// int size = driver.findElements(By.tagName("iframe")).size();

		System.out.println(size);

		driver.switchTo().frame(index);

		Thread.sleep(1500);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollBy(0, 20)", "");

		List<WebElement> pdfNames = driver
				.findElements(By.xpath("//div[@class ='thelanguage' and @contentindex='0c']/ul/li"));

		for (int i = 0; i < pdfNames.size(); i++) {
			pdfName = pdfNames.get(i).getText();

			System.out.println(pdfName);
			 pngName = pdfName;
			Row row = sheet.createRow(rowNum++);

			row.createCell(0).setCellValue(pdfName);
			// String urlOFPdfs = pdfNames.get(i).getAttribute("href");

		//}

		List<WebElement> pdf = driver
				.findElements(By.xpath("//div[@class ='thelanguage' and @contentindex='0c']/ul/li/a"));

	//	System.out.println(pdf.size());

		//for (int i = 0; i < pdf.size(); i++) {
			// pdfName = pdf.get(i).getText();
			//
			// System.out.println(pdfName);
			pdf.get(i).click();
			Thread.sleep(1500);

			

			// String urlOFPdfs = pdf.get(i).getAttribute("href");
			Set<String> set = driver.getWindowHandles();

			Iterator<String> it = set.iterator();

			String parentWin = it.next();

			String childWin = it.next();

			driver.switchTo().window(childWin);
			TakesScreenshot t = (TakesScreenshot) driver;

			File srcFile = t.getScreenshotAs(OutputType.FILE);

			File destFile = new File(".\\ScreenshotOD1\\" + pngName + ".png");
			org.apache.commons.io.FileUtils.copyFile(srcFile, destFile);
			String url = driver.getCurrentUrl();

			// Row row = sheet.createRow(rowNum1++);
			Row row1 = sheet.getRow(rowNum1++);
			// Row row = sheet.createRow(rowNum++);

			// row.createCell(0).setCellValue(pdfName);
			row1.createCell(1).setCellValue(url);
			// String pngName = "";
			//
			// pngName = pdfName;

			// row.createCell(1).setCellValue(urlOFPdfs);

			try {

				WebElement titleOfPage = driver.findElement(By.xpath("//div[@class='title']"));

				String failedTitle = titleOfPage.getText();

				System.out.println(failedTitle);

				row.createCell(2).setCellValue(failedTitle);

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

		// ".\\Qtr1-7-18Screenshot\\"

		FileOutputStream fileOut = new FileOutputStream(
				".\\OD_1_ExcelSheets\\" + System.currentTimeMillis() + "Individual Agents Public_Disclosure .xlsx");

		workbook.write(fileOut);

		fileOut.close();

		driver.quit();
	}

}