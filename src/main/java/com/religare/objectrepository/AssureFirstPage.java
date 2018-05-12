package com.religare.objectrepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.religare.genericlib.BaseClass;
import com.religare.genericlib.ExcelLib;
import com.religare.genericlib.WebDriverCommonLib;

public class AssureFirstPage {

	JavascriptExecutor jse = (JavascriptExecutor) BaseClass.driver;

	ExcelLib elib = new ExcelLib();

	WebDriverCommonLib clib = new WebDriverCommonLib();

	@FindBy(id = "txtIconMinus_id")

	WebElement totalMemberMinus;

	@FindBy(id = "txtIconPlus_id")

	WebElement totalMemberPlus;

	@FindBy(id = "select_skin_demo_enhance_8")

	WebElement ageDropDown;

	@FindBy(name = "ageGroupOfEldestMember")

	WebElement ageDropDown9;

	@FindBy(id = "mobile")

	WebElement mobileNumber;

	@FindBy(id = "carebuynowimage") // carebuynowimage

	WebElement careBuyNowButton;

	@FindBy(id = "tenure1")

	WebElement tenure1;

	@FindBy(id = "tenure2")

	WebElement tenure2;

	@FindBy(id = "tenure3")

	WebElement tenure3;

	// @FindBy(xpath ="//div[contains(@class, 'ui-slider-range ui-widget-header
	// ui-corner-all ui-slider-range-min')]"))

	public void assurePolicyPlan() throws Throwable {

		ExcelLib elib = new ExcelLib();

		String age = elib.getExcelData("Assure", 0, 1);

		String mob = elib.getExcelData("Assure", 1, 1);// select_skin_demo_enhance_9

		WebDriverCommonLib clib = new WebDriverCommonLib();

		clib.select(ageDropDown9, age);

		// log.debug("Selecting the age of eldest Member as " + age );

		Thread.sleep(2300);

		try {

			mobileNumber.sendKeys(mob);

			Alert al = BaseClass.driver.switchTo().alert();

			WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);

			wait.until(ExpectedConditions.alertIsPresent());

			al.accept();

		} catch (Exception e) {

			e.getMessage();
		}

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,250);");

		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void slider() throws Throwable {

		Thread.sleep(1500);

		WebElement slider = BaseClass.driver.findElement(By.xpath(
				"//div[contains(@class, 'ui-slider-range ui-widget-header ui-corner-all ui-slider-range-min')]"));

		Dimension dim = slider.getSize();

		int x = dim.getWidth();

		Actions actions = new Actions(BaseClass.driver);

		actions.clickAndHold(slider).moveByOffset(x - 100, 0).release().build().perform();

		// log.debug("Moving the slider ");}
	}

	public void tenure() throws Throwable {

		String tenure = elib.getExcelData("Assure", 2, 1);

		if (tenure.equalsIgnoreCase("two")) {

			tenure2.click();

		} else if (tenure.equalsIgnoreCase("three")) {

			tenure3.click();

		}
	}
	// log.debug("Selecting the Tenure ");

	public void capture() throws Throwable {

		Thread.sleep(5000);

		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("assurecare")));

		String ncb = BaseClass.driver.findElement(By.id("assurecare")).getAttribute("innerHTML");

		// log.debug("Your Premium is " + ncb );

		WebDriverWait wait3 = new WebDriverWait(BaseClass.driver, 20);

		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("carebuynowimage")));

		BaseClass.driver.findElement(By.id("carebuynowimage")).click();

		// log.debug("clicking on the buy now button");

		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(1500);

	}

	public void next() {
		clib.javaScriptScroll();

		careBuyNowButton.click();
	}
}
