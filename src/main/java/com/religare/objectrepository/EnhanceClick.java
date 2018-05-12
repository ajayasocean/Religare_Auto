package com.religare.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.religare.genericlib.WebDriverCommonLib;

public class EnhanceClick {

	@FindBy(xpath = "//div[@class='greenTxtBox' and text()='Super Top-up Insurance']")

	WebElement moveToEnhance;

	@FindBy(xpath = "//a[contains(@onclick, 'Enhance') and @class='planBoxOutScroll']")

	WebElement clickOnEnhance;

	public void clickOnEnhance() {

		WebDriverCommonLib clib = new WebDriverCommonLib();

		clib.moveMouseToElement(moveToEnhance);

		clickOnEnhance.click();

	}

}
