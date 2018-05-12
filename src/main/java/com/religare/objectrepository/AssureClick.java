package com.religare.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.religare.genericlib.WebDriverCommonLib;

public class AssureClick {

	@FindBy(xpath = "//div[@class='greenTxtBox' and text()='Critical Illness & Personal Accident Insurance']")

	WebElement moveToAssure;

	@FindBy(xpath = "//a[contains(@onclick, 'Assure') and @class='planBoxOutScroll']")

	WebElement clickOnAssure;

	public void clickOnAssure() {

		WebDriverCommonLib clib = new WebDriverCommonLib();

		clib.moveMouseToElement(moveToAssure);

		clickOnAssure.click();

	}

}
