package com.religare.testscripts;

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
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PressReleasePageTest {
	WebDriver driver;

	int rowNumber;

	@BeforeMethod

	public void launchDisclosurePage() {

		// Launching Chrome Driver

		System.setProperty("webdriver.chrome.driver", ".//resouRces//chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launching disclosure Page

		driver.get("https://rhicluat.religarehealthinsurance.com/religare-health-insurance-press.html");

	}

	@Test

	public void mediaCoverageTestPdf() throws Throwable {

		Workbook workbook = new XSSFWorkbook();

		CreationHelper createHelper = workbook.getCreationHelper();

		Sheet sheet = workbook.createSheet("Qtr1_17_18");

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

		List<WebElement> listOfPdf = driver.findElements(By.xpath("//a[@class='ng-binding']"));////a[@class ='ng-binding']

		System.out.println(listOfPdf.size());

		for (int i = 0; i < listOfPdf.size(); i++) {

			listOfPdf.get(i).click();

			String pdfName = listOfPdf.get(i).getText();

			String urlOFPdfs = listOfPdf.get(i).getAttribute("href");

			System.out.println(urlOFPdfs);

			System.out.println(pdfName);

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

			// System.out.println(driver.getCurrentUrl());
			//

			Row row = sheet.createRow(rowNum++);

			row.createCell(0).setCellValue(pdfName);

			row.createCell(1).setCellValue(urlOFPdfs);

			try {

				WebElement titleOfPage = driver.findElement(By.xpath("//div[@class='title']"));

				String failedTitle = titleOfPage.getText();

				row.createCell(2).setCellValue(failedTitle);

			} catch (NoSuchElementException e) {

				e.getMessage();
			}

			for (int j = 0; j < columns.length; j++) {

				sheet.autoSizeColumn(j);
			}

			driver.close();

			driver.switchTo().window(parentWin);

		}

		LocalDateTime now = LocalDateTime.now();

		FileOutputStream fileOut = new FileOutputStream("D://PressRelease_" + System.currentTimeMillis() + ".xlsx");

		workbook.write(fileOut);

		fileOut.close();

		driver.quit();

	}

}


