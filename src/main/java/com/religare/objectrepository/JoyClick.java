package com.religare.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.religare.genericlib.WebDriverCommonLib;

public class JoyClick {

	@FindBy(xpath = "//div[@class='greenTxtBox' and text()='Maternity & Newborn Cover with Health Insurance']")

	WebElement moveToJoy;

	@FindBy(xpath = "//a[contains(@onclick, 'Joy') and @class='planBoxOutScroll']")

	WebElement clickOnJoy;

	public void clickOnJoy() {

		WebDriverCommonLib clib = new WebDriverCommonLib();

		clib.moveMouseToElement(moveToJoy);

		clickOnJoy.click();

	}

}
