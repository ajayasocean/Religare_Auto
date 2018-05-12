package com.religare.testscripts;

import java.io.FileOutputStream;
import java.net.HttpURLConnection;

//import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

import java.net.URL;
import java.time.LocalDateTime;

import org.apache.http.util.TextUtils;
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
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.religare.genericlib.BaseClass;

@SuppressWarnings("resource")
public class LinkTest extends BaseClass {

	// public static WebDriver driver =null ;
	// public static void main(String[] args) throws IOException
	// {

	// System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
	//
	// WebDriver driver = new ChromeDriver();

	// driver.get("http://test.moifash.com/syed/favorite");
	// driver.manage().window().maximize();
	// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// log.debug("opening the website" );
	@Test
	public void liNkTest() throws Throwable {
		Workbook workbook = new XSSFWorkbook();
		CreationHelper createHelper = workbook.getCreationHelper();
		Sheet sheet = workbook.createSheet("Links");
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

		String[] columns = { "LinkText", "HREF", "Response" };
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
			cell.setCellStyle(headerCellStyle);

		}
		// Create Cell Style for formatting Date
		CellStyle dateCellStyle = workbook.createCellStyle();
		dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

		// Create Other rows and cells with employees data
		int rowNum = 1;

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("the link count is " + links.size());
		int alinksCount = 0;
		for (int i = 0; i < links.size(); i++) {

			if (!TextUtils.isEmpty(links.get(i).getText())) {

				System.out.println(i + ">>>" + links.get(i).getText());
				WebElement ele = links.get(i);
				String url = ele.getAttribute("href");
				// System.out.println("url : " + url);

				if (!url.contains("javascript:void(0);")) {
					alinksCount++;
					verifyLinkActive(i, links.get(i).getText(), url, sheet, alinksCount);
				}
				// System.out.println("The Count of link on the Homepage of Religare customer
				// portal is " +alinksCount);

			}

		}

		for (int i = 0; i < columns.length; i++) {
			sheet.autoSizeColumn(i);
		}

		LocalDateTime now = LocalDateTime.now();
		FileOutputStream fileOut = new FileOutputStream("D://links_" + System.currentTimeMillis() + ".xlsx");
		workbook.write(fileOut);
		fileOut.close();
	}

	public static void verifyLinkActive(Integer position, String linkGetText, String linkUrl, Sheet sheet,
			int rowNumber) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			String response = "";
			if (httpURLConnect.getResponseCode() == 200) {
				response = httpURLConnect.getResponseMessage();
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			} else if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				response = httpURLConnect.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND;
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);
			} else {
				response = httpURLConnect.getResponseMessage() + " - UNKNOWN ERROR";
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - UNKNOWN ERROR");
			}

			Row row = sheet.createRow(rowNumber++);

			row.createCell(0).setCellValue(linkGetText);

			row.createCell(1).setCellValue(linkUrl);

			row.createCell(2).setCellValue(response);

		} catch (Exception e) {

		}

		return;

	}
}
