package com.religare.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.religare.genericlib.WebDriverCommonLib;

public class CareClick {

	@FindBy(xpath = "//div[@class='greenTxtBox' and text()='Comprehensive Health Insurance']")

	WebElement moveToCare;

	@FindBy(xpath = "//a[contains(@onclick, 'Health Insurance Plans') and @class='planBoxOutScroll']")

	WebElement clickOnCare;

	public void clickOnCare() {

		WebDriverCommonLib clib = new WebDriverCommonLib();

		clib.moveMouseToElement(moveToCare);

		clickOnCare.click();

	}

}
