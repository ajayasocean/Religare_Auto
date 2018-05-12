package com.religare.objectrepository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.WebDriverCommonLib;

public class Joypolicyplan {

	ExcelLib elib = new ExcelLib();

	WebDriverCommonLib clib = new WebDriverCommonLib();

	@FindBy(id = "joyQuoteBox1")
	WebElement Joytoday;
	@FindBy(id = "joyQuoteBox2")
	WebElement Joytomorrow;
	@FindBy(id = "txtIconMinus_id")
	WebElement Totalmembersminus;
	@FindBy(id = "txtIconPlus_id")
	WebElement Totalmembersplus;
	@FindBy(id = "mobile")
	WebElement Mobile;
	@FindBy(id = "tenure1")
	WebElement tenure1;
	@FindBy(id = "tenure2")
	WebElement tenure2;
	@FindBy(id = "tenure3")
	WebElement tenure3;
	@FindBy(id = "carebuynowimage")
	WebElement Buy;

	public void joytype() throws Throwable {
		String joy = elib.getExcelData("Joypolicyplan", 0, 1);
		if (joy.equals("Joy Tomorrow")) {
			Joytoday.click();
		} else {
			Joytomorrow.click();
		}
		// log.debug("Selecting the Joy option as " + joy);
	}

	public void totalmember() throws Throwable {
		String totalmem = elib.getExcelData("Joypolicyplan", 2, 1);
		int totalmemInt = Integer.parseInt(totalmem);
		if (totalmemInt == 1) {
			Totalmembersminus.click();

		} else if (totalmemInt == 2) {

		} else {

			for (int i = 3; i <= totalmemInt; i++) {
				Totalmembersplus.click();

			}
		}
		// log.debug("Selecting the total members of count " + totalmem);
	}

	public void age() throws Throwable {
		String age = elib.getExcelData("Joypolicyplan", 4, 1);
		WebElement lis = BaseClass.driver.findElement(By.id("select_skin_demo_joy_9"));
		Select select = new Select(lis);
		select.selectByVisibleText(age);
		// log.debug("Selecting the age of eldest Member as " + age );
	}

	public void mobile() throws Throwable {
		String mobilenumber = elib.getExcelData("Joypolicyplan", 6, 1);
		try {
			Thread.sleep(1500);

			Mobile.sendKeys(mobilenumber);
			Alert al = BaseClass.driver.switchTo().alert();

			WebDriverWait wdWait = new WebDriverWait(BaseClass.driver, 20);
			wdWait.until(ExpectedConditions.alertIsPresent());
			al.accept();
			Thread.sleep(1500);
		} catch (Exception e) {
			e.toString();
		}

		Thread.sleep(1500);

	}

	public void slider() throws Throwable {
		Thread.sleep(1500);
		WebElement slider = BaseClass.driver.findElement(By.xpath("//div[contains(@class, 'ui-slider-range ui-widget-header ui-corner-all ui-slider-range-min')]"));
		Dimension dim = slider.getSize();
		int x = dim.getWidth();
		Actions actions = new Actions(BaseClass.driver);
		actions.clickAndHold(slider).moveByOffset(x - 350, 0).release().build().perform();
		// log.debug("Moving the slider ");
	}

	public void tensure() throws Throwable {
		String tenure = elib.getExcelData("Joypolicyplan", 8, 1);
		int tenureint = Integer.parseInt(tenure);
		if (tenureint == 1) {
			tenure1.click();
		} else if (tenureint == 2) {
			tenure2.click();
		} else if (tenureint == 3) {
			tenure3.click();
		}
		// log.debug("Selecting the Tenure as " + tenure );
	}

	public void totalpremium() throws Throwable {
		Thread.sleep(5000);
		String ncb = BaseClass.driver.findElement(By.id("joyprimiumone")).getAttribute("innerHTML");
		// log.debug("Your Premium is " + ncb );
	}

	public void buy() {
		  JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;

		  js.executeScript("window.scrollBy(0,1000)");
		WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("carebuynowimage")));
		Buy.click();
		// log.debug("clicking on the buy now button");
	}
}
