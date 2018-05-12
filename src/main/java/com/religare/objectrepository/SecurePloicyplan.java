package com.religare.objectrepository;

import java.util.NoSuchElementException;

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

public class SecurePloicyplan {
	ExcelLib elib = new ExcelLib();

	WebDriverCommonLib clib = new WebDriverCommonLib();
	@FindBy(id = "select_skin_demo_secure_7")
	WebElement Annualincome;
	@FindBy(id = "mobile")
	WebElement Mobile;
	@FindBy(id = "typeofemployment1")
	WebElement Salaried;
	@FindBy(id = "typeofemployment2")
	WebElement SelfEmployeed;
	@FindBy(id = "tenure1")
	WebElement tenure1;
	@FindBy(id = "tenure2")
	WebElement tenure2;
	@FindBy(id = "tenure3")
	WebElement tenure3;
	@FindBy(id = "carebuynowimage")
	WebElement Buy;

	public void age() throws Throwable {
		try {
		String age = elib.getExcelData("Securepolicyplane", 0, 1);
		WebElement lis = BaseClass.driver.findElement(By.id("select_skin_demo_secure_6"));
		Select select = new Select(lis);
		select.selectByVisibleText(age);}
		catch(NoSuchElementException e) {}
		// log.debug("Selecting the Age of Member as " + age);
	}

	public void income() throws Throwable {
		String income = elib.getExcelData("Securepolicyplane", 2, 1);
		Annualincome.sendKeys(income);
		// log.debug("Entering the Annual income as " + income);
	}

	public void mobile() throws Throwable {
		Thread.sleep(1500);
		String mobilenumber = elib.getExcelData("Securepolicyplane", 4, 1);
		Mobile.sendKeys(mobilenumber);
		Thread.sleep(1500);
	}

	public void typeofemployement() throws Throwable {
		String emp = elib.getExcelData("Securepolicyplane", 6, 1);
		if (emp.equals("Salaried")) {
			Salaried.click();
			// log.debug("Clicking the type of employment as Salaried" );
		} else {
			SelfEmployeed.click();
		}

		// log.debug("Clicking the type of employment as self Employed" );
	}

	public void sliders() throws Throwable {
		Thread.sleep(1500);
		WebElement slider = BaseClass.driver.findElement(By.xpath("//div[@class='selector']"));
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
		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,250);");
		Thread.sleep(5000);
		String ncb = BaseClass.driver.findElement(By.id("secureprimiumone")).getAttribute("innerHTML");
		// log.debug("Your Premium is " + ncb );
		String ncr = BaseClass.driver.findElement(By.id("secureprimiumtwo")).getAttribute("innerHTML");
		// log.debug("Your Premium is " + ncr );

	}

	public void buy() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(BaseClass.driver, 20);
		
		Thread.sleep(2100);

		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("carebuynowimage")));
		Buy.click();
		// log.debug("clicking on the buy now button");
	}
}
