package com.religare.objectrepository;

import java.util.concurrent.TimeUnit;

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

public class CarefreedomPoliPlan {

	ExcelLib elib = new ExcelLib();

	WebDriverCommonLib clib = new WebDriverCommonLib();

	@FindBy(id = "mobile")

	WebElement Mobile;

	@FindBy(id = "tenure1")

	WebElement tenure1;

	@FindBy(id = "tenure2")

	WebElement tenure2;

	@FindBy(id = "tenure3")

	WebElement tenure3;

	@FindBy(id = "carebuynowimage")

	WebElement buy;

	public void TotalMembersAge() throws Throwable {

		String totalmem = elib.getExcelData("CarefreedomPolicyplan", 0, 1);

		String age = elib.getExcelData("CarefreedomPolicyplan", 2, 1);

		int totalmemInt = Integer.parseInt(totalmem);

		if (totalmemInt == 1) {

			BaseClass.driver.findElement(By.id("txtIconMinus_id")).click();

			WebElement lis = BaseClass.driver.findElement(By.id("ageGroupOfEldestMember1"));

			Select select = new Select(lis);

			select.selectByVisibleText(age);

		} else if (totalmemInt == 2) {

		} else {

			for (int i = 3; i <= totalmemInt; i++) {

				BaseClass.driver.findElement(By.id("txtIconPlus_id")).click();

			}
		}

		// log.debug("Increasing/decreasing the total members of count");
		try {

			WebElement lis = BaseClass.driver.findElement(By.id("ageGroupOfEldestMember"));

			Select select = new Select(lis);

			select.selectByVisibleText(age);

		} catch (Exception e) {
			e.getMessage();

		}
		// log.debug("Selecting the age of eldest Member as " + age );

		Thread.sleep(1500);
	}

	public void mobile() throws Throwable {
		Thread.sleep(1500);

		String mobilenumber = elib.getExcelData("CarefreedomPolicyplan", 4, 1);

		Mobile.sendKeys(mobilenumber);

		Thread.sleep(1500);
	}

	public void slider() throws Throwable {
		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,250);");

		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(1500);

		WebElement slider = BaseClass.driver.findElement(By.xpath("//div[contains(@class, 'ui-slider-range ui-widget-header ui-corner-all ui-slider-range-min')]"));

		Dimension dim = slider.getSize();

		int x = dim.getWidth();
		Actions actions = new Actions(BaseClass.driver);

		actions.clickAndHold(slider).moveByOffset(x - 350, 0).release().build().perform();

		// log.debug("Moving the slider ");
	}

	public void tensure() throws Throwable {

		String tenure = elib.getExcelData("CarefreedomPolicyplan", 6, 1);

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

	public void totalpremium() throws InterruptedException {

		Thread.sleep(5000);

		WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, 20);

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("ncb")));

		String ncb = BaseClass.driver.findElement(By.id("ncb")).getAttribute("innerHTML");

		// log.debug("Your Premium for Care Freedom with Home Care " + ncb );

		WebDriverWait wait2 = new WebDriverWait(BaseClass.driver, 20);

		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("care")));

		String care = BaseClass.driver.findElement(By.id("care")).getAttribute("innerHTML");
		// log.debug("Your Premium for Care Freedom" + care);
	}

	// public void buy() {
	// WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("carebuynowimage")));
	// buy.click();
	// // log.debug("clicking on the buy now button");
	// }
	public void buy() throws Throwable {

		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
		
		Thread.sleep(2000);

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("carebuynowimage")));
		
		clib.javaScriptScroll();

		buy.click();
	}
}
